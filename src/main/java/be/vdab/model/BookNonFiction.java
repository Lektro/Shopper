package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
public class BookNonFiction extends Book {

    public BookNonFiction() {}

    public BookNonFiction(String bookType) {
        this.bookType = "NON-FICTION";
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column
    private Subject bookSubject;

    public Long getId() {
        return id;
    }

    public Subject getBookSubject() {
        return bookSubject;
    }

    public void setBookSubject(Subject bookSubject) {
        this.bookSubject = bookSubject;
    }

    public enum Subject{
        HISTORY,
        COOCKING,
        SCIENCE,
        SPORT
    }
}