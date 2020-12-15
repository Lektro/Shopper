package be.vdab;

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
        BookFiction bookFiction = new BookFiction("FICTION", BookFiction.Genre.FANTASY);
        bookFiction.setBookType("FANTASY");
        bookFiction.setAuthor("JK Rowling");
        bookFiction.setPrice(10.00);
        bookFiction.setTitle("Harry Potter and his little elf");
        bookFiction.setPublisherId(1);
        bookFiction.setPageCount(285);
        bookFiction.setIsbn("1587859684754");
        bookFiction.setBookDescription("test description, casting no longer needed");
        bookFiction.getArticleType();
        articleRepository.save(bookFiction);

    }
}
