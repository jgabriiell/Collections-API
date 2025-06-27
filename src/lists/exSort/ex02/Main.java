package lists.exSort.ex02;

public class Main {
    public static void main(String[] args) {

        NumbersSorting numbersSorting = new NumbersSorting();

        numbersSorting.addNumber(2);
        numbersSorting.addNumber(13);
        numbersSorting.addNumber(25);
        numbersSorting.addNumber(14);
        numbersSorting.addNumber(17);
        numbersSorting.addNumber(1);
        numbersSorting.addNumber(31);

        System.out.println(numbersSorting.ascendingOrder());
        System.out.println(numbersSorting.descendantOrder());
    }
}
