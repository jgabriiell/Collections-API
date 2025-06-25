package generics;

public class Main {
    public static void main(String[] args) {

        Printer<String> stringPrinter = new Printer<>("Hello, World!");
        stringPrinter.printThing();

        Printer<Integer> integerPrinter = new Printer<>(100);
        integerPrinter.printThing();

        Printer<Double> doublePrinter = new Printer<>(100.00d);
        doublePrinter.printThing();

        message("Jhonny");
        message(30);
        message('c');
        message(false);
    }

    private static <T> void message(T whatever) {
        System.out.println("Hey, " + whatever);
    }
}
