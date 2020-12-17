package be.vdab.model;

import javax.persistence.*;

@Entity
public class Book extends Article {

    @Column(length = 100)
    private String author;

    @Column
    private String isbn;

    @Column
    private int pageCount;

    @Column
    private String bookType;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setBookType(String type) {
        this.bookType = type;
    }

    public String getBookType() {
        return bookType;
    }

    public void setBookGenre(BookFiction.Genre genre) {
    }

    public void setSummary(String summary) {
    }

    public void setGenre(BookFiction.Genre genre) {
    }
}
