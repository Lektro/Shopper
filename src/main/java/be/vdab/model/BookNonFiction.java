package be.vdab.model;

import javax.persistence.*;
// the moment this class gets active it messes up the booktype in the restcontroller
@Entity
@DiscriminatorValue("book")
public class BookNonFiction extends Book {

    private String bookType;

    public enum Subject {
        HISTORY,
        COOKING,
        SCIENCE,
        SPORT
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    Subject subject;

    public BookNonFiction() {

    }
    public BookNonFiction(String bookType) {
        this.bookType = bookType;
    }

    public Long getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public String getBookType() {
        return bookType;
    }
}
