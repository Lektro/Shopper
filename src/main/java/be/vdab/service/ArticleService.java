package be.vdab.service;

import be.vdab.model.Article;

public interface ArticleService {

    Iterable<Article> getAllArticles();

    void save(Article article);
}
