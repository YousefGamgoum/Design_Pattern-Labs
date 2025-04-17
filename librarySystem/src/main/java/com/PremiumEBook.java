package com;

public class PremiumEBook extends EBook {
    private EBook originalEBook;

    public PremiumEBook(EBook originalEBook) {
        super(originalEBook.getTitle());
        this.originalEBook = originalEBook;
    }

    @Override
    public void borrowBook(User user) {
        if (user.isPremium()) {
            System.out.println(user.getName() + " is borrowing the premium version of " + getTitle() + ". Extra 10 days allowed.");
            // Add extra 10 days of borrowing for premium users
        } else {
            originalEBook.borrowBook(user);
        }
    }

    @Override
    public void returnBook() {
        originalEBook.returnBook();  // Delegate the return action to the original EBook.
    }

    @Override
    public boolean isAvailable() {
        return originalEBook.isAvailable();
    }

    @Override
    public String getTitle() {
        return originalEBook.getTitle();
    }
}
