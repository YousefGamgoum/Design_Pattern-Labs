package com;

public class Manager extends BorrowRequestHandler {

    @Override
    public void handleRequest(User user, Book book) {
        if (user.isPremium()) {
            System.out.println("Manager: Premium user. Allowing extended borrowing time for " + book.getTitle());
        } else {
            System.out.println("Manager: Regular user. Processing borrowing request for " + book.getTitle());
        }
        // Additional logic for handling the book borrowing (e.g., issuing the book)
        book.borrowBook(user);
    }
}
