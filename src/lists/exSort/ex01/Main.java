package lists.exSort.ex01;

public class Main {
    public static void main(String[] args) {

        SortPerson sortPerson = new SortPerson();

        sortPerson.addPerson("Jhonny", 23, 1.92);
        sortPerson.addPerson("Rose", 52, 1.70);
        sortPerson.addPerson("Mary", 22, 1.65);

        System.out.println(sortPerson.sortByAge());
        System.out.println(sortPerson.sortByHeight());
    }
}
