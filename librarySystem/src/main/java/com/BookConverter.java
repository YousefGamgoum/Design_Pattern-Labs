package com;

import com.fasterxml.jackson.databind.ObjectMapper;

public class BookConverter {
    private ObjectMapper objectMapper;

    public BookConverter() {
        this.objectMapper = new ObjectMapper();
    }

    public Book convertJsonToBook(String json) throws Exception {
        // Convert JSON string to ExternalBookDTO object
        ExternalBookDTO externalBook = objectMapper.readValue(json, ExternalBookDTO.class);

        // Based on the borrowable status, we can create a PhysicalBook or other types
        if (externalBook.isBorrowable()) {
            // Create PhysicalBook since it's borrowable
            PhysicalBook book = new PhysicalBook(externalBook.getBookTitle());
            return book;
        } else {
            // Create an EBook or any other type of book if it's not borrowable
            EBook ebook = new EBook(externalBook.getBookTitle());
            return ebook;
        }
    }
}
