import { Component, OnInit } from '@angular/core';
import { TaxeTnbService } from '../taxe-tnb.service';
import { TaxeTnb } from './TaxeTnb';

@Component({
  selector: 'app-taxe-tnb',
  templateUrl: './taxe-tnb.component.html',
  styleUrls: ['./taxe-tnb.component.css']
})
export class TaxeTnbComponent implements OnInit {
  taxes: TaxeTnb[] = [];
  editingTax: TaxeTnb | null = null;

  constructor(private taxeTnbService: TaxeTnbService) {}

  ngOnInit(): void {
    this.loadAllTaxes();
  }

  loadAllTaxes(): void {
    this.taxeTnbService.getAllTaxes().subscribe(
      (data) => { this.taxes = data; },
      (error) => { console.error(error); }
    );
  }

  newTax(): void {
    this.editingTax = new TaxeTnb(0, 0, 0, 0, new Date().getFullYear(), 0, '', '', '');
  }

 

  saveTax(): void {
    if (this.editingTax && this.editingTax.id) {
      // Call the update API
      this.taxeTnbService.saveTax(this.editingTax).subscribe(
        () => {
          this.loadAllTaxes(); // Reload the list
          this.cancelEdit();
        }
      );
    } 
  }

  deleteTax(id: number): void {
    this.taxeTnbService.deleteTaxById(id).subscribe(
      () => {
        this.loadAllTaxes(); // Reload the list
      }
    );
  }

  cancelEdit(): void {
    this.editingTax = null;
  }
}
