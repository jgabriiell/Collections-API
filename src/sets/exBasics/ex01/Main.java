package sets.exBasics.ex01;

public class Main {
    public static void main(String[] args) {

        GuestsSet guestsSet = new GuestsSet();

        guestsSet.addGuest("Jhonny", 123);
        guestsSet.addGuest("Rose", 456);
        guestsSet.addGuest("Mary", 789);

        guestsSet.showGuests();

        guestsSet.removeByCode(123);
        guestsSet.showGuests();

        System.out.println(guestsSet.countGuests());
    }
}
