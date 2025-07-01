package sets.exSearch.ex01;

public class Main {
    public static void main(String[] args) {

        ContactsBook contactsBook = new ContactsBook();

        contactsBook.addContact("Jhonny", 123456);
        contactsBook.addContact("Rose", 789456);
        contactsBook.addContact("Mary", 147852);

        contactsBook.showAllContacts();

        System.out.println(contactsBook.findContactByName("jhonny"));
        contactsBook.updateContactNumber("Rose", 3546980);
        System.out.println(contactsBook.findContactByName("rose"));
    }
}
