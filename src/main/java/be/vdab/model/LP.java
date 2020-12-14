package be.vdab.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class LP extends Article{

    public enum Genre{
       CLASSIC,
        POP,
        ROCK,
        DANCE,
        R_AND_B,
        HIPHOP
    }

    // region variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    String Performer;

        @Column
    Game.Genre genre;
    // endregion

    // region getters / setters
    public Long getId() {
        return id;
    }

    public String getPerformer() {
        return Performer;
    }

    public void setPerformer(String performer) {
        Performer = performer;
    }

    public Game.Genre getGenre() {
        return genre;
    }

    public void setGenre(Game.Genre genre) {
        this.genre = genre;
    }
    // endregion

}
