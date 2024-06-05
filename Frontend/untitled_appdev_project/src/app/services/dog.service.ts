import { Observable } from "rxjs";
import { Dog } from "../model/dog.model";
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from "@angular/core";
@Injectable({
  providedIn: 'root'
})
export class DogService {
  dogUrl: string
  constructor(private http: HttpClient) {
    this.dogUrl = 'http://localhost:4201/api/dog';
  }

  public getDog(id: number): Observable<Dog> {
    return this.http.get<Dog>(this.dogUrl + '/show' + id.toString());
  }

  public getDogs(): Observable<Dog[]> {
    return this.http.get<Dog[]>(this.dogUrl + '/all');
  }
}
