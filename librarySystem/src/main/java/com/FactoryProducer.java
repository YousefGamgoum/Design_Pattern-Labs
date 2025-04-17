package com;

public class FactoryProducer {
    public static BookFactory getFactory(String bookType) {
        if (bookType.equalsIgnoreCase("physical")) {
            return new PhysicalBookFactory();
        } else if (bookType.equalsIgnoreCase("ebook")) {
            return new EBookFactory();
        } else if (bookType.equalsIgnoreCase("historical")) {
            return new HistoricalBookFactory();
        }
        return null;
    }
}
