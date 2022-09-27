import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { identity, Observable, of } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AvionService {

  API_Avion = "http://localhost:8082/api/Avion";
  

  constructor(private http: HttpClient) { 
  }

  getAll(){
    return this.http.get(`${this.API_Avion}`);
  }

  get(id: number){
    return this.http.get(`${this.API_Avion}/${id}`);
  }

  create(data: any) {
    return this.http.post(`${this.API_Avion}`, data);
  }

  update(data: any):Observable<Object> { 
    return this.http.post(`${this.API_Avion}/${data.numAvion}`, data);
  }
  
  delete(id: number):Observable<Object>{
    return this.http.delete(`${this.API_Avion}/${id}`);
  }

}
