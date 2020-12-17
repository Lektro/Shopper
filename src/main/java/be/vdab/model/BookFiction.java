package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("Fiction")
public class BookFiction extends Book {

    @Column
    @Enumerated(EnumType.STRING)
    private Genre genre;

    @Column
    private String summary;

    public BookFiction() {}

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public enum Genre {
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
    }
}
