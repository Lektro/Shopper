package be.vdab.model;

import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class BookNonFiction extends Book{

    // region variables
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    enum Subject{
        HISTORY,
        COOCKING,
        SCIENCE,
        SPORT
    }

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
