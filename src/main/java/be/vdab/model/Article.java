package be.vdab.model;

import javax.persistence.*;
import java.util.List;

@Entity
@DiscriminatorColumn(name = "article_type", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Article {

    // region variables
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
    // endregion

    // region getters / setters
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
    // endregion

}
