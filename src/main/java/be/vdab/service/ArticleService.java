package be.vdab.service;

import be.vdab.model.Article;

import javax.validation.constraints.NotNull;

public interface ArticleService {
    @NotNull Iterable<Article> getAllArticles();
}
