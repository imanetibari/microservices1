import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';

import { Injectable } from '@angular/core';
import { Proprietaire } from './proprietaire/Proprietaire';

@Injectable({
  providedIn: 'root'
})
export class ProprietaireService {
  private apiUrl = 'http://localhost:8088/proprietaire';

  constructor(private http: HttpClient) { }

  findAll(): Observable<Proprietaire[]> {
    return this.http.get<Proprietaire[]>(`${this.apiUrl}/findAll`);
  }

  findById(id: number): Observable<Proprietaire> {
    return this.http.get<Proprietaire>(`${this.apiUrl}/findById/${id}`);
  }

  findByCin(cin: string): Observable<Proprietaire> {
    return this.http.get<Proprietaire>(`${this.apiUrl}/findByCin/${cin}`);
  }

  save(entity: Proprietaire): Observable<Proprietaire> {
    return this.http.post<Proprietaire>(`${this.apiUrl}/save`, entity);
  }

  update(id: number, entity: Proprietaire): Observable<Proprietaire> {
    return this.http.put<Proprietaire>(`${this.apiUrl}/update/${id}`, entity);
  }

  deleteById(id: number): Observable<any> {
    return this.http.delete<any>(`${this.apiUrl}/deleteById/${id}`);
  }
}
