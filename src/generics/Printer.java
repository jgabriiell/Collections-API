package generics;

public class Printer<T> {

    private T thingToPrint;

    public Printer(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void printThing() {
        System.out.println(thingToPrint);
    }
}
