package lists.exSearch.ex02;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.List;

public class SumNumbers {

    private List<Integer> numbers;

    public SumNumbers() {
        this.numbers = new ArrayList<>();
    }

    public void addNumber(int number) {
        this.numbers.add(number);
    }

    public int sumAll() {
        verifyStorage();
        int sum = 0;
        for (Integer i: numbers) sum += i;
        return sum;
    }

    public int findHigher() {
        verifyStorage();
        int higher = Integer.MIN_VALUE;
        for (Integer i: numbers) if (i >= higher) higher = i;
        return higher;
    }

    public int findLower() {
        verifyStorage();
        int lower = Integer.MAX_VALUE;
        for (Integer i: numbers) if (i <= lower) lower = i;
        return lower;
    }

    public void showAllNumbers() {
        verifyStorage();
        System.out.println(numbers);
    }

    private void verifyStorage() {
        if (this.numbers.isEmpty()) throw new EmptyStorageException("There is nothing in the list");
    }


}
