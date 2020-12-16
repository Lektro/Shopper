package be.vdab.service;

import be.vdab.model.Article;

public interface ArticleService {
    Iterable<Article> getAllArticles();
    Iterable<Article> getArticlesById(int id);

}
