package be.vdab.restcontroller;

import be.vdab.model.Article;
import be.vdab.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/article")
public class ArticleRestController {
    private ArticleService articleService;

    public ArticleRestController (ArticleService articleService) { this.articleService = articleService; }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Article> getArticles() {
        return articleService.getAllArticles();
    }
}