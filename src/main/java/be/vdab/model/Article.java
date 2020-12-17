package be.vdab.model;

import javax.persistence.*;

@Entity(name = "article")
@DiscriminatorColumn(name = "articleType", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Article {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false, nullable = false)
    private Long id;

    @Column(nullable = false,length = 100)
    private String title;

    @Column(nullable = false, precision = 2)
    private double price;

    @Column(nullable = false,length = 100)
    private long publisherId;

    @Column(nullable=false, updatable=false, insertable=false)
    public String articleType;

    public void setId(Long id) {
        this.id = id;
    }

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
