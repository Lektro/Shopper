package be.vdab.model;

import javax.persistence.*;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Book extends Article{

    // region variables
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    @Column(length = 100)
    String author;
    @Column
    String isbn;
    @Column
    int pageCount;
    // endregion

    // region getters / setters
    public Long getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }
    // endregion

}
