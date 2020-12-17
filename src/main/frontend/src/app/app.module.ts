import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticleComponent } from './article/article.component';
import { AppService } from './services/appService';
import { HttpClientModule } from '@angular/common/http';
import { CreateArticleComponent } from './create-article/create-article.component';


@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    CreateArticleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule
  ],
  providers: [AppService],
  bootstrap: [AppComponent]
})
export class AppModule { }
