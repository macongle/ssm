package com.ssm.model;

import org.springframework.stereotype.Component;

@Component
public class Book {
    private Integer bookNo;

    private String bookTitle;

    private String bookAuthor;

    private Integer bookType;

    private Integer price;

    public Integer getBookNo() {
        return bookNo;
    }

    public void setBookNo(Integer bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle == null ? null : bookTitle.trim();
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor == null ? null : bookAuthor.trim();
    }

    public Integer getbookType() {
        return bookType;
    }

    public void setbookType(Integer bookType) {
        this.bookType = bookType;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}