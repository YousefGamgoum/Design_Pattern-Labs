package com;
import java.util.ArrayList;
import java.util.List;

public class Book implements BookInterface {
    private String title;
    private boolean isAvailable;
    private List<Observer> observers;  // List of users who want to be notified

    public Book(String title) {
        this.title = title;
        this.isAvailable = true;
        this.observers = new ArrayList<>();
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
        if (isAvailable) {
            notifyObservers();  // Notify observers when the book becomes available
        }
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public String getTitle() {
        return title;
    }

    // Method to add an observer (user who wants to be notified)
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    // Method to remove an observer
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers that the book is available
    private void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    @Override
    public void borrowBook(User user) {
        if (isAvailable) {
            isAvailable = false;
            System.out.printf(user.getName() + " successfully borrowed " + title);
        } else {
            System.out.println(title + " is not available.");
        }
    }

    @Override
    public void returnBook() {
        isAvailable = true;
        System.out.println("\n" + title + " has been returned.");
    }
}
