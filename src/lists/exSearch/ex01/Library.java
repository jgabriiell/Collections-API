package lists.exSearch.ex01;

import lists.exceptions.EmptyStorageException;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private final List<Book> bookList;

    public Library() {
        this.bookList = new ArrayList<>();
    }

    public Book storeBook(String name, String author, int yearOfPublication) {
        Book bookToSave = new Book(name, author, yearOfPublication);
        bookList.add(bookToSave);
        return bookToSave;
    }

    public List<Book> findBookByAuthor(String bookAuthor) {
        verifyStorage();
        List<Book> booksPerAuthor = new ArrayList<>();
        for (Book b: bookList) {
            if (b.getAuthor().equalsIgnoreCase(bookAuthor)) booksPerAuthor.add(b);
        }
        return booksPerAuthor;
    }

    public List<Book> findByRangeOfYears(int firstYear, int lastYear) {
        verifyStorage();
        List<Book> booksAmongYears = new ArrayList<>();
        for (Book b: bookList) if (firstYear <= b.getYearOfPublication() && b.getYearOfPublication() <= lastYear)
            booksAmongYears.add(b);
        return booksAmongYears;
    }

    public Book findByTitle(String title) {
        verifyStorage();
        Book bookByTitle = null;
        for (Book b: bookList) if (b.getName().equalsIgnoreCase(title)) bookByTitle = b;
        return bookByTitle;
    }

    private void verifyStorage() {
        if (this.bookList.isEmpty()) throw new EmptyStorageException("There is no book stored");
    }
}
