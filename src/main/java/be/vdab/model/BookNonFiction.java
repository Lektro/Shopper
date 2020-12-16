package be.vdab.model;

import javax.persistence.*;

@Entity
public class BookNonFiction extends Book{

    public enum Subject{
        HISTORY,
        COOCKING,
        SCIENCE,
        SPORT
    }

    // region variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column
    Subject subject;
    // endregion

    // region getters / setters
    public Long getId() {
        return id;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    // endregion
}