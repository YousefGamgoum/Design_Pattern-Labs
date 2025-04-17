package com;

import java.util.ArrayList;
import java.util.List;
public class LibraryService {

    private List<Book> books = new ArrayList<>();

    public LibraryService() {}

    // Add a book to the library
    public void addBook(Book book) {
        books.add(book);
    }

    // Find a book by title
    public Book findBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }
        return null;
    }

    // Borrow a book
    public void borrowBook(String title, User user) {
        Book book = findBook(title);
        if (book == null) {
            System.out.println(title + " is not found in the library.");
        } else if (!book.isAvailable()) {
            System.out.println(title + " is not available.");
        } else {
            book.borrowBook(user);
        }
    }

    // Return a book and notify users
    public void returnBook(String title) {
        Book book = findBook(title);
        if (book != null) {
            book.returnBook();
        } else {
            System.out.println(title + " is not found in the library.");
        }
    }

    // Method to subscribe a user to a book's availability notifications
    public void subscribeToBookAvailability(String bookTitle, User user) {
        Book book = findBook(bookTitle);
        if (book != null) {
            book.addObserver(user);
            System.out.println(user.getName() + " is now subscribed to notifications for the book: " + bookTitle);
        } else {
            System.out.println(bookTitle + " not found in the library.");
        }
    }
}
