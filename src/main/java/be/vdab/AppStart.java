package be.vdab;

import be.vdab.model.Article;
import be.vdab.model.Book;
import be.vdab.model.BookFiction;
import be.vdab.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        bookFiction.setType("FANTASY");
        bookFiction.setAuthor("JK Rowling");
        bookFiction.setPrice(10.00);
        bookFiction.setTitle("Harry Potter and his little elf");
        bookFiction.setPublisherId(1);
        articleRepository.save(bookFiction);

    }
}
