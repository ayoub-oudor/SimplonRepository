import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class BilletService {

  API_Billet = "http://localhost:8082/api/Billet";
  

  constructor(private http: HttpClient) { 
  }

  getAll(){
    return this.http.get(`${this.API_Billet}`);
  }

  get(id: number){
    return this.http.get(`${this.API_Billet}/${id}`);
  }

  create(data: any) {
    return this.http.post(`${this.API_Billet}`, data);
  }

  update(data: any) {
    return this.http.post(`${this.API_Billet}/${data.id}`, data);
  }
  
  delete(id: number):Observable<Object>{
    return this.http.delete(`${this.API_Billet}/${id}`);
  }
}
