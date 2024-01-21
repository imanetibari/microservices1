import { Component, OnInit } from '@angular/core';
import { Proprietaire } from './Proprietaire';
import { ProprietaireService } from '../proprietaire.service';


@Component({
  selector: 'app-proprietaire',
  templateUrl: './proprietaire.component.html',
  styleUrls: ['./proprietaire.component.css']
})
export class ProprietaireComponent implements OnInit {
  proprietaires: Proprietaire[] = [];
  selectedProprietaire: Proprietaire | null = null;

  constructor(private proprietaireService: ProprietaireService) {}

  ngOnInit(): void {
    this.loadAllProprietaires();
  }

  loadAllProprietaires(): void {
    this.proprietaireService.findAll().subscribe(
      (data) => { this.proprietaires = data; },
      (error) => { console.error(error); }
    );
  }

  selectProprietaire(proprietaire: Proprietaire): void {
    this.selectedProprietaire = proprietaire;
  }

  saveProprietaire(proprietaire: Proprietaire): void {
    this.proprietaireService.save(proprietaire).subscribe(
      () => { this.loadAllProprietaires(); },
      (error) => { console.error(error); }
    );
  }

  updateProprietaire(proprietaire: Proprietaire): void {
    if (proprietaire.id) {
      this.proprietaireService.update(proprietaire.id, proprietaire).subscribe(
        () => { this.loadAllProprietaires(); },
        (error) => { console.error(error); }
      );
    }
  }

  deleteProprietaire(id: number): void {
    this.proprietaireService.deleteById(id).subscribe(
      () => { this.loadAllProprietaires(); },
      (error) => { console.error(error); }
    );
  }
}
