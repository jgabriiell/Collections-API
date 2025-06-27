package lists.exSort.ex01;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortPerson {

    List<Person> people;

    public SortPerson() {
        this.people = new ArrayList<>();
    }

    public void addPerson(String name, int age, double height) {
        people.add(new Person(name, age, height));
    }

    public List<Person> sortByAge() {
        verifyStorage();
        List<Person> peopleSorted = new ArrayList<>(this.people);
        Collections.sort(peopleSorted);
        return peopleSorted;
    }

    public List<Person> sortByHeight() {
        verifyStorage();
        List<Person> peopleByHeight = new ArrayList<>(this.people);
        peopleByHeight.sort(new ComparatorByAge());
        return peopleByHeight;
    }

    private void verifyStorage() {
        if (this.people.isEmpty()) throw new EmptyStorageException("There is no one on the list");
    }
}
