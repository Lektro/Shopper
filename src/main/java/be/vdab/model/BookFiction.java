package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
public class BookFiction extends Book{

    private final String type = "FICTION";

    public enum Genre{
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
    }

    // region variables

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    Genre genre;

    @Column
    String description;
    // endregion

    // region getters / setters


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

    public String getType() {
        return type;
    }
    // endregion

}
