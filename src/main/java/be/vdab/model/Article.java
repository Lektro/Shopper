package be.vdab.model;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public abstract class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @OneToMany
    List<Review> reviews;

    @OneToMany
    List<OrderArticle> orderArticles;

    @OneToMany
    List<Favorite> favorites;

    String title;
    double price;
    long publisherId;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
