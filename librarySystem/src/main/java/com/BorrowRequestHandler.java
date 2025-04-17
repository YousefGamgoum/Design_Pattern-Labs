package com;

public abstract class BorrowRequestHandler {
    protected BorrowRequestHandler nextHandler;

    public void setNextHandler(BorrowRequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(User user, Book book);
}
