package com;

public class EBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new EBook(title);
    }
}
