package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
public class BookFiction extends Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private String bookSummary;

    public BookFiction() {}

    public BookFiction(String bookType) {
        this.bookType = "FICTION";
    }

    public Long getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getBookType() {
        return bookType;
    }

    public String getBookSummary() {
        return bookSummary;
    }

    public void setBookSummary(String bookSummary) {
        this.bookSummary = bookSummary;
    }

    public enum Genre {
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
    }
}
