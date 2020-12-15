package be.vdab.service;

import be.vdab.model.Article;
import be.vdab.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private final ArticleRepository articleRepository;

    public ArticleServiceImpl (ArticleRepository articleRepository) {
        this.articleRepository = articleRepository;
    }

    @Override
    public Iterable<Article> getAllArticles() {
        return articleRepository.findAll();
    }

}
