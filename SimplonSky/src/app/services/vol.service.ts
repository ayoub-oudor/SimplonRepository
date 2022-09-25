import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class VolService {

  API_Vol = "http://localhost:8082/api/Vol";

  constructor(private http: HttpClient) { }

  getAll(){
    return this.http.get(`${this.API_Vol}`);
  }

  get(id: number){
    return this.http.get(`${this.API_Vol}/${id}`);
  }

  create(data: any) {
    return this.http.post(`${this.API_Vol}`, data);
  }

  update(data: any):Observable<Object> {
    return this.http.post(`${this.API_Vol}/${data.numVol}`, data);
  }
  
  delete(id: number):Observable<Object>{
    return this.http.delete(`${this.API_Vol}/${id}`);
  }
}
