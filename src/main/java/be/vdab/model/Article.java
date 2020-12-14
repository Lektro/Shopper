package be.vdab.model;

import javax.persistence.*;
import java.util.List;

@MappedSuperclass
public abstract class Article {

    // region variables
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

    @Column
    String title;

    @Column
    double price;

    @Column
    long publisherId;
    // endregion

    // region getters / setters
    public Long getId() {
        return id;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<OrderArticle> getOrderArticles() {
        return orderArticles;
    }

    public void setOrderArticles(List<OrderArticle> orderArticles) {
        this.orderArticles = orderArticles;
    }

    public List<Favorite> getFavorites() {
        return favorites;
    }

    public void setFavorites(List<Favorite> favorites) {
        this.favorites = favorites;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public long getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(long publisherId) {
        this.publisherId = publisherId;
    }
    // endregion

}
