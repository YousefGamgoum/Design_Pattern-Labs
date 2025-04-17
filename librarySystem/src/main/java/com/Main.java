package com;

public class Main {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        Book book1 = new Book("Harry Potter");
        Book book2 = new Book("Lord of the Rings");
        library.addBook(book1);
        library.addBook(book2);

        User john = new User("John");
        User alice = new User("Alice");

        // Subscribe users to notifications for the book
        library.subscribeToBookAvailability("Harry Potter", john);
        library.subscribeToBookAvailability("Lord of the Rings", alice);

        // Borrow books and return them to test notifications
        library.borrowBook("Harry Potter", john);
        library.returnBook("Harry Potter");  // This should notify John

        library.borrowBook("Lord of the Rings", alice);
        library.returnBook("Lord of the Rings");  // This should notify Alice
    }
}
