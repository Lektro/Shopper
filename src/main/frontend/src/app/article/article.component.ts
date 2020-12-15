import { Component, OnInit } from '@angular/core';
import { Article } from '../models/article-model';
import { AppService } from '../services/appService';

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  articles : Article[] = [];

  constructor(private appService: AppService) {

  }

  ngOnInit(): void {
      this.appService.getArticles().subscribe(articles => {this.articles = articles})
  }

}
