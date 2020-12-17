package be.vdab.model;

import javax.persistence.*;

@Entity
@DiscriminatorValue("book")
@Inheritance(strategy = InheritanceType.JOINED)
public class BookNonFiction extends Book {

    @Column
    @Enumerated(EnumType.STRING)
    private Subject subject;

    public BookNonFiction() {}

    public Subject getBookSubject() {
        return subject;
    }

    public void setBookSubject(Subject bookSubject) {
        this.subject = bookSubject;
    }

    public enum Subject{
        HISTORY,
        COOKING,
        SCIENCE,
        SPORT
    }
}