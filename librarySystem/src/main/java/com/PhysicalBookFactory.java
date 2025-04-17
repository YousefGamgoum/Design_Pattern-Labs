package com;

public class PhysicalBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new PhysicalBook(title);
    }
}
