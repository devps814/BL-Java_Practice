package DesignPatterns.Review;

public class LibrarySystem {

    public static void main(String[] args) {

        // Singleton Pattern initializes
        LibraryManager manager = LibraryManager.getManager();
        Student s1 = new Student("Dev");
        Student s2 = new Student("Shivam");

        //Observer Pattern
        manager.registerObserver(s1);
        manager.registerObserver(s2);

        Book fictionBook = Bookfactory.createBook("fiction");
        Book scienceBook = Bookfactory.createBook("science");

        manager.addBook(fictionBook);
        manager.addBook(scienceBook);

        }
}
