package lists.exSearch.ex01;

public class Book {

    private String name;
    private String author;
    private int yearOfPublication;

    public Book() {
    }

    public Book(String name, String author, int yearOfPublication) {
        this.name = name;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return String.format ("{Name - %s; Author - %s; Publication - %s}",
                this.name, this.author,  this.yearOfPublication);
    }
}