package be.vdab.restcontroller;

import be.vdab.model.Article;
import be.vdab.service.ArticleService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/article")
@CrossOrigin(origins = "http://localhost:4200")
public class ArticleRestController {

    private ArticleService articleService;

    public ArticleRestController (ArticleService articleService) { this.articleService = articleService; }

    @GetMapping(value = { "", "/" })
    public @NotNull Iterable<Article> getArticles() {
        return articleService.getAllArticles();
    }

    @GetMapping(value = "/{id}")
    public @NotNull Iterable<Article> getArticlesById(@PathVariable("id") int id) {
        return articleService.getArticlesById(id);
    }
}
