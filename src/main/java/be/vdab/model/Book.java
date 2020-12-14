package be.vdab.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
@Inheritance(strategy = InheritanceType.JOINED)
public class Book extends Article{



    String author;
    String isbn;
    int pageCount;
}
