package be.vdab.restcontroller;

import be.vdab.model.Article;
import be.vdab.service.ArticleService;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleRestController {

    private ArticleService articleService;

    public ArticleRestController (ArticleService articleService) { this.articleService = articleService; }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Article> getArticles() {
        Iterable<Article> listArticles = articleService.getAllArticles();
        return listArticles;
    }

    @PostMapping(value = { "", "/" })
    void addArticle(@RequestBody Article article) {
        articleService.save(article);
    }
}