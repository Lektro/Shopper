package be.vdab.model;

import javax.persistence.*;

@Entity
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Score score;

    private String description;

    @ManyToOne
    private User user;

    @ManyToOne
    private Article article;

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

    public User getUser() {
        return user;
    }

    public Review setUser(User user) {
        this.user = user;
        return this;
    }

    public Article getArticle() {
        return article;
    }

    public Review setArticle(Article article) {
        this.article = article;
        return this;
    }
}
