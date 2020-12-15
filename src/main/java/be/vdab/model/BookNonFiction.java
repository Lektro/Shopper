package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")

public class BookNonFiction extends Book{

    private final String type = "NON-FICTION";


    public enum Subject{
        HISTORY,
        COOKING,
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

    public String getType() {
        return type;
    }

    // endregion
}
