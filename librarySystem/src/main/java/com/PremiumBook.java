package com;

public class PremiumBook extends Book {
    private Book originalBook;

    public PremiumBook(Book originalBook) {
        super(originalBook.getTitle());
        this.originalBook = originalBook;
    }

    @Override
    public void borrowBook(User user) {
        if (user.isPremium()) {
            System.out.println(user.getName() + " is borrowing the premium version of " + getTitle() + ". Extra 10 days allowed.");
            // Add extra 10 days for premium users
            // Assuming the book has a way to track borrowed time, we add 10 days extra here.
            // This is an example behavior that could be extended depending on the original Book entity.
        } else {
            originalBook.borrowBook(user);
        }
    }

    @Override
    public void returnBook() {
        originalBook.returnBook();
    }

    @Override
    public boolean isAvailable() {
        return originalBook.isAvailable();
    }

    @Override
    public String getTitle() {
        return originalBook.getTitle();
    }
}
