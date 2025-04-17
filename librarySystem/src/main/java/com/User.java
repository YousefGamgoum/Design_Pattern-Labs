package com;
public class User implements Observer {
    private String name;
    private boolean isPremium;

    public User(String name) {
        this.name = name;
    }

    public User(String name, boolean isPremium) {
        this.name = name;
        this.isPremium = isPremium;
    }

    public String getName() {
        return name;
    }

    public boolean isPremium() {
        return isPremium;
    }

    @Override
    public void update(Book book) {
        System.out.println(name + ", the book \"" + book.getTitle() + "\" is now available for borrowing!");
    }
}
