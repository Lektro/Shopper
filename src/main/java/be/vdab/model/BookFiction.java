package be.vdab.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BookFiction extends Book{

    enum Genre{
        THRILLER,
        FANTASY,
        DEDECTIVE,
        ROMANCE,
        SCIFI
    }

    // region variables

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
    // endregion

}
