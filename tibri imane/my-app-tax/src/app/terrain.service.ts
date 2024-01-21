import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Terrain } from './terrain/Terrain';

@Injectable({
  providedIn: 'root'
})
export class TerrainService {
  private apiUrl = 'http://localhost:8089/Terrain';

  httpOptions = {
    headers: new HttpHeaders({ 'Content-Type': 'application/json' })
  };

  constructor(private http: HttpClient) { }

  findAll(): Observable<Terrain[]> {
    return this.http.get<Terrain[]>(`${this.apiUrl}/findAll`);
  }

  save(entity: Terrain): Observable<Terrain> {
    return this.http.post<Terrain>(`${this.apiUrl}/save`, entity, this.httpOptions);
  }

  findById(id: number): Observable<Terrain> {
    return this.http.get<Terrain>(`${this.apiUrl}/findById/${id}`);
  }

  deleteById(id: number): Observable<any> {
    return this.http.delete(`${this.apiUrl}/deleteById/${id}`, this.httpOptions);
  }

  update(id: number, entity: Terrain): Observable<Terrain> {
    return this.http.put<Terrain>(`${this.apiUrl}/update/${id}`, entity, this.httpOptions);
  }

  findByProprietaireCin(cin: string): Observable<Terrain[]> {
    return this.http.get<Terrain[]>(`${this.apiUrl}/findByProprietaireCin/${cin}`);
  }
}
