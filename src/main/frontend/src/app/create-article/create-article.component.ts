import { Component, OnInit } from '@angular/core';
import {AppService} from '../services/appService';
import {Router} from '@angular/router';
import {Article} from '../models/article-model';
import {ArticleService} from '../services/article.service';

@Component({
  selector: 'app-create-article',
  templateUrl: './create-article.component.html',
  styleUrls: ['./create-article.component.css']
})
export class CreateArticleComponent implements OnInit {

  constructor(private articleService: ArticleService, private router: Router ) { }

  submitted = false;
  articles: Article[] = [];

  ngOnInit(): void {
    this.articleService.createArticle((articles: Article[]) => this.articles = articles);
  }

}
