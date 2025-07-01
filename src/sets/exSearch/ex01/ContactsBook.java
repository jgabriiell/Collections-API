package sets.exSearch.ex01;

import java.util.HashSet;
import java.util.Set;

public class ContactsBook {

    private final Set<Contact> contactsBook;

    public ContactsBook() {
        this.contactsBook = new HashSet<>();
    }

    public void addContact(String name, int number) {
        contactsBook.add(new Contact(name, number));
    }

    public void showAllContacts() {
        verifyStorage();
        System.out.println(contactsBook);
    }

    public Contact findContactByName(String name) {
        verifyStorage();
        Contact contactFound = null;
        for (Contact c: contactsBook) if (c.getName().equalsIgnoreCase(name)) contactFound = c;
        return contactFound;
    }

    public void updateContactNumber(String name, int newPhoneNumber) {
        Contact contactToUpdate = findContactByName(name);
        contactToUpdate.setPhoneNumber(newPhoneNumber);
    }

    private void verifyStorage() {
        if (contactsBook.isEmpty()) throw new RuntimeException("No contact registered");
    }
}
