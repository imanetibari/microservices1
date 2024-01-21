import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { TaxeTnb } from './taxe-tnb/TaxeTnb';

@Injectable({
  providedIn: 'root'
})
export class TaxeTnbService {
  private apiUrl = 'http://localhost:8089/TaxeTnb';

  constructor(private http: HttpClient) { }

  saveTax(tax: TaxeTnb): Observable<TaxeTnb> {
    return this.http.post<TaxeTnb>(`${this.apiUrl}/save`, tax);
  }

  getAllTaxes(): Observable<TaxeTnb[]> {
    return this.http.get<TaxeTnb[]>(`${this.apiUrl}/findAll`);
  }

  getTaxById(id: number): Observable<TaxeTnb> {
    return this.http.get<TaxeTnb>(`${this.apiUrl}/findById/${id}`);
  }

  getTaxByProprietaireCIN(CIN: string): Observable<TaxeTnb[]> {
    return this.http.get<TaxeTnb[]>(`${this.apiUrl}/findByProprietaireCIN/${CIN}`);
  }

  deleteTaxById(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/delete/${id}`);
  }

  calculateTax(id: number): Observable<TaxeTnb> {
    return this.http.put<TaxeTnb>(`${this.apiUrl}/calculateTax/${id}`, {});
  }
}
