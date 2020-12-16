import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ArticleComponent } from './article/article.component';
import { AppService } from './services/appService';
import { HttpClientModule } from '@angular/common/http';
import { LoginComponent } from './login/login.component';
import {DropdownDirective} from "./shared/dropdown.directive";


@NgModule({
  declarations: [
    AppComponent,
    ArticleComponent,
    LoginComponent,
    DropdownDirective
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
