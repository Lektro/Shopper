import {HttpClient} from '@angular/common/http';
import {Injectable} from '@angular/core';
import { Observable } from 'rxjs';
import { Article } from '../models/article-model';

@Injectable({providedIn: 'root'})
    export class AppService {
    private readonly articlesUrl: string;

    constructor(private http: HttpClient) {
      this.articlesUrl = 'http://localhost:8080/api';
    }

    public getArticles(): Observable<Article[]> {
        return this.http.get<Article[]>(this.articlesUrl);

    }

}
