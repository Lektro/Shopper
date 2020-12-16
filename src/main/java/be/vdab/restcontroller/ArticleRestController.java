package be.vdab.restcontroller;

import be.vdab.model.Article;
import be.vdab.service.ArticleService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleRestController {

    private ArticleService articleService;

    public ArticleRestController (ArticleService articleService) { this.articleService = articleService; }

    @GetMapping(value = { "", "/" })
    public @NotNull List<Article> getArticles() {
        List<Article> listArticles = articleService.getAllArticles();

        return listArticles;
    }
}