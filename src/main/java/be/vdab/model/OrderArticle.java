package be.vdab.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OrderArticle {


    private Long id;
    Order order;
    Article article;


    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
