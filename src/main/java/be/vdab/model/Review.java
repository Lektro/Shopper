package be.vdab.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    @Enumerated(EnumType.STRING)
    private Score score;

    @Column
    private String description;




    // Getters & Setters
    public Long getId() {
        return id;
    }

    public Score getScore() {
        return score;
    }

    public Review setScore(Score score) {
        this.score = score;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public Review setDescription(String description) {
        this.description = description;
        return this;
    }



}
