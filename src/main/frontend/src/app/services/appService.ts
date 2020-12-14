import {HttpClient} from '@angular/common/http';
import {Injectable} from "@angular/core";

@Injectable()
    export class appService {
    private articlesUrl = "/articles";

    constructor(private http: HttpClient) {
    }

}
