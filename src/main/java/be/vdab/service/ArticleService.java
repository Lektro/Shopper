package be.vdab.service;

import be.vdab.model.Article;
import org.springframework.stereotype.Service;

@Service
public interface ArticleService {
    Iterable<Article> getAllArticles();

    Iterable<Article> createArticle();

    Article save(Article article);
}
