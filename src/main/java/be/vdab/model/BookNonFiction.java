package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("NonFiction")
public class BookNonFiction extends Book {

    @Column
    @Enumerated(EnumType.STRING)
    private Subject subject;

    public BookNonFiction() {}

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public enum Subject{
        HISTORY,
        COOKING,
        SCIENCE,
        SPORT
    }
}