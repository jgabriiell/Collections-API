package lists.exSearch.ex01;

public class Main {
    public static void main(String[] args) {

        Library library = new Library();

        library.storeBook("Mere christianity", "CS Lewis", 1952);
        library.storeBook("The Chronicles of Narnia", "CS Lewis", 1950);
        library.storeBook("The hobbit", "J.R.R. Tolkien", 1937);
        library.storeBook("The fellowship oh the ring", "J.R.R. Tolkien", 1954);
        library.storeBook("Harry Potter and the Sorcerer's Stone", "J.K. Rolling", 1997);
        library.storeBook("Harry Potter and the Prisoner of Azkaban", "J.K. Rolling", 1999);

        System.out.println(library.findBookByAuthor("cs lewis"));
        System.out.println(library.findBookByAuthor("j.r.r. TOLKIEN"));
        System.out.println(library.findBookByAuthor("J.K. ROLLING"));

        System.out.println(library.findByRangeOfYears(1950, 1960));

        System.out.println(library.findByTitle("harry potter and the prisoner of azkaban"));
    }
}
