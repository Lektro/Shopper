package be.vdab.model;

import org.hibernate.annotations.Formula;

import javax.persistence.*;

@Entity
@DiscriminatorColumn(name = "articleType", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    String title;

    @Column(nullable = false, precision = 2)
    double price;

    @Column(nullable = false,length = 100)
    long publisherId;

    @Column(name="articleType", nullable=false, updatable=false, insertable=false)
    private String articleType;

    public String getArticleType() {
        return articleType;
    }

    public void setArticleType(String articleType) {
        this.articleType = articleType;
    }

    public Long getId() {
        return id;
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

}
