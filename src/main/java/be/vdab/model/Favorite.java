package be.vdab.model;

import javax.persistence.*;

@Entity
public class Favorite {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;


    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }
}
