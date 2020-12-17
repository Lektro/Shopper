package be.vdab.service;

import be.vdab.model.Article;

import java.util.ArrayList;
import java.util.List;

public interface ArticleService {
    Iterable<Article> getAllArticles();

    void save(Article article);
}
