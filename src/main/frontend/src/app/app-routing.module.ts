import { NgModule } from '@angular/core';
import {Routes, RouterModule, Router} from '@angular/router';
import { ArticleComponent } from './article/article.component';
import {AppComponent} from './app.component';

const routes: Routes = [
  { path: 'article', component: ArticleComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})

export class AppRoutingModule { }
