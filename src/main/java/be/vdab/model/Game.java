package be.vdab.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Game extends Article{

    public enum Genre{
        MMORPG,
        RPG,
        FPS,
        RTS,
        RACE
    }

    // region variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    String Publisher;

    @Column
    int ageRestriction;

    @Column
    Genre genre;
    // endregion

    // region getters / setters
    public Long getId() {
        return id;
    }

    public String getPublisher() {
        return Publisher;
    }

    public void setPublisher(String publisher) {
        Publisher = publisher;
    }

    public int getAgeRestriction() {
        return ageRestriction;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    // endregion

}
