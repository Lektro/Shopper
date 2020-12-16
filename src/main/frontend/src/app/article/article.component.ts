import {Component, Input, OnInit,EventEmitter} from '@angular/core';
import { Article } from '../models/article-model';
import { AppService } from '../services/appService';
import {Observable, Subject} from "rxjs";
import {NgModel} from "@angular/forms";
import {debounceTime, distinctUntilChanged} from "rxjs/operators";
import {RouterModule} from "@angular/router";

@Component({
  selector: 'app-article',
  templateUrl: './article.component.html',
  styleUrls: ['./article.component.css']
})
export class ArticleComponent implements OnInit {

  articles : Article[] = [];

  @Input() id: number = 0;
  articles2 : Observable<Article[]> | undefined

  articleSubject: Subject<string> = new Subject();
  searchArticle: EventEmitter<string> = new EventEmitter<string>();

  constructor(private appService: AppService) {

  }

  ngOnInit(): void {
      this.appService.getArticles().subscribe(articles => {this.articles = articles})
      // this.appService.getArticles().subscribe  ||| keep looking at appservice.getArticles()
      // articles =>                              ||| [returntype] articles = [returnvalue]
      // {this.articles = articles}               ||| code (here) to do with articles

    this.articleSubject.pipe(debounceTime(1000),distinctUntilChanged())
      .subscribe(x => this.searchArticle.emit(x));
  }

  updateId(newId : any): void{
    if(newId.length <= 0){return;} //don't do stuff when empty
    this.id = newId;
    console.log(newId);
    this.updateArticlesById();
  }

  updateArticlesById(): void{
    this.articles2 = this.appService.getArticlesById(this.id);
  }



}
