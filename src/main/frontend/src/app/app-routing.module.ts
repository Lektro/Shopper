import { NgModule } from '@angular/core';
import {Routes, RouterModule, Router} from '@angular/router';
import { ArticleComponent } from './article/article.component';
import {CreateArticleComponent} from './create-article/create-article.component';

const routes: Routes = [
  { path: 'article', component: ArticleComponent },
  { path: 'create-article', component: CreateArticleComponent}

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
