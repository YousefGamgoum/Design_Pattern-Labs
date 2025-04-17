package com;

public class HistoricalBookFactory implements BookFactory {
    @Override
    public Book createBook(String title) {
        return new HistoricalBook(title);
    }
}
