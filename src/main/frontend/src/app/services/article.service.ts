import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class ArticleService {

  private baseUrl = 'http://localhost:8080/api/';

  constructor(private http: HttpClient) { }

  getArticleList(): Observable<any> {
    return this.http.get(`${this.baseUrl}` + 'articles');
  }

  createArticle(article: object): Observable<object> {
    return this.http.post(`${this.baseUrl}` + 'create-article', article);
  }
}
