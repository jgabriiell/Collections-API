package sets.exBasics.ex01;

import java.util.HashSet;
import java.util.Set;

public class GuestsSet {

    private Set<Guest> guestSet;

    public GuestsSet() {
        this.guestSet = new HashSet<>();
    }

    public void addGuest(String name, int code) {
        this.guestSet.add(new Guest(name, code));
    }

    public void removeByCode(int code) {
        verifyStorage();
        Guest guestToRemove = null;
        for (Guest g: guestSet) {
            if (g.getCode() == code) {
                guestToRemove = g;
                break;
            }
        }
        guestSet.remove(guestToRemove);
    }

    public int countGuests() {
        return this.guestSet.size();
    }

    public void showGuests() {
        System.out.println(guestSet);
    }

    private void verifyStorage() {
        if (guestSet.isEmpty()) throw new RuntimeException("There is no guest in the set");
    }
}
