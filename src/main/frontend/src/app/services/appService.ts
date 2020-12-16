import {HttpClient} from '@angular/common/http';
import {Injectable} from "@angular/core";
import { Observable } from 'rxjs';
import { Article } from '../models/article-model';

@Injectable({providedIn: "root"})
    export class AppService {
    private articlesUrl = "/article";

    constructor(private http: HttpClient) {
    }

    public getArticles(): Observable<Article[]> {
        return this.http.get<Article[]>(this.articlesUrl);
    }
    public getArticlesById(id: number): Observable<Article[]>{
      return this.http.get<Article[]>(this.articlesUrl + "/" + id);
    }


}
