import { Component, OnInit } from '@angular/core';
import {AppService} from '../services/appService';
import {Router} from '@angular/router';
import {Article} from '../models/article-model';

@Component({
  selector: 'app-create-article',
  templateUrl: './create-article.component.html',
  styleUrls: ['./create-article.component.css']
})
export class CreateArticleComponent implements OnInit {

  constructor(private appService: AppService, private router: Router ) { }

  ngOnInit(): void {
  }

}
