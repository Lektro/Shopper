package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
public class BookFiction extends Book {

    private String bookType;

    public BookFiction() {}

    public BookFiction(String bookType, Genre genre) {
        this.bookType = bookType;
        this.genre = genre;
    }

    public enum Genre {
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    private Genre genre;

    @Column
    String description;

    public Long getId() {
        return id;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getBookType() {
        return bookType;
    }
}
