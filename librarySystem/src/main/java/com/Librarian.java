package com;

public class Librarian extends BorrowRequestHandler {

    @Override
    public void handleRequest(User user, Book book) {
        if (book.isAvailable()) {
            System.out.println("Librarian: The book is available. Passing request to Manager.");
            // Pass to the next handler (Manager)
            if (nextHandler != null) {
                nextHandler.handleRequest(user, book);
            }
        } else {
            System.out.println("Librarian: The book is not available.");
        }
    }
}