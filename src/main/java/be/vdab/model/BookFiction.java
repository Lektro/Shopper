package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
public class BookFiction extends Book {

    private String bookType;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private String bookDescription;

    public BookFiction() {}

    public BookFiction(String bookType) {
        this.bookType = bookType;
    }

    public enum Genre {
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
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

    public String getBookDescription() {
        return bookDescription;
    }

    public void setBookDescription(String bookDescription) {
        this.bookDescription = bookDescription;
    }

    public String getBookType() {
        return bookType;
    }
}
