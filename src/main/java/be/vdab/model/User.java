package be.vdab.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.List;

@Entity
public class User {

    private Long id;
    List<Review> reviews;
    List<Order> orders;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
