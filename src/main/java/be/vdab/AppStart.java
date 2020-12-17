package be.vdab;

import be.vdab.model.Book;
import be.vdab.model.BookFiction;
import be.vdab.model.BookNonFiction;
import be.vdab.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import static be.vdab.model.BookFiction.Genre.FANTASY;
import static be.vdab.model.BookNonFiction.Subject.COOKING;

@SpringBootApplication
public class AppStart implements CommandLineRunner {

    @Autowired
    private ArticleRepository articleRepository;

    public static void main(String[] args) {
        SpringApplication.run(AppStart.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Book bookFiction = new BookFiction();

        bookFiction.setAuthor("JK Rowling");
        bookFiction.setBookType("FICTION");
        bookFiction.setPrice(10.00);
        bookFiction.setTitle("Harry Potter and his little elf");
        bookFiction.setPublisherId(1);
        bookFiction.setPageCount(285);
        bookFiction.setIsbn("1587859684754");
        bookFiction.setGenre(FANTASY);
        bookFiction.setSummary("REEEE");

        // these two dont get listed, type null is gone tho lol
       // bookFiction.setGenre();
       // bookFiction.setBookSummary();

        articleRepository.save(bookFiction);

        BookNonFiction bookNonFiction = new BookNonFiction();
        bookNonFiction.setTitle("Cooking with the Cock");
        bookNonFiction.setBookType("NON-FICTION");
        bookNonFiction.setPrice(15);
        bookNonFiction.setPublisherId(2);
        bookNonFiction.setAuthor("Swedish Chef");
        bookNonFiction.setPageCount(158);
        bookNonFiction.setIsbn("1587859625874");
        bookNonFiction.setBookSubject(COOKING);

        articleRepository.save(bookNonFiction);

        articleRepository.findAll();


    }
}
