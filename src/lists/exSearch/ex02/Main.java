package lists.exSearch.ex02;

public class Main {
    public static void main(String[] args) {

        SumNumbers sumNumbers = new SumNumbers();

        sumNumbers.addNumber(1);
        sumNumbers.addNumber(2);
        sumNumbers.addNumber(3);
        sumNumbers.addNumber(4);
        sumNumbers.addNumber(5);
        sumNumbers.addNumber(6);

        System.out.println(sumNumbers.sumAll());
        System.out.println(sumNumbers.findHigher());
        System.out.println(sumNumbers.findLower());
        sumNumbers.showAllNumbers();
    }
}
