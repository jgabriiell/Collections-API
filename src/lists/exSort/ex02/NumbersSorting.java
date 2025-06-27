package lists.exSort.ex02;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumbersSorting {

    private List<Integer> numbers;

    public NumbersSorting() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public List<Integer> ascendingOrder() {
        verifyStorage();
        List<Integer> numbersAscending = new ArrayList<>(numbers);
        Collections.sort(numbersAscending);
        return numbersAscending;
    }

    public List<Integer> descendantOrder() {
        verifyStorage();
        List<Integer> numbersDescendant = new ArrayList<>(numbers);
        numbersDescendant.sort(Collections.reverseOrder());
        return numbersDescendant;
    }

    private void verifyStorage() {
        if (this.numbers.isEmpty()) throw new EmptyStorageException("There is no number in the list");
    }
}
