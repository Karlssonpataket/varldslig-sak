package com.library;

public class Borrowedbooks {
    private Book book;
    private Member borrowedTo;

    public Borrowedbooks(Book book){
        this.book = book;
    }

    public Member getmember() {
        return borrowedTo;
    }

    public Book getBook() {
        return book;
    }

    public void setMember(Member borrowedTo) {
        this.borrowedTo = borrowedTo;
    }
}

