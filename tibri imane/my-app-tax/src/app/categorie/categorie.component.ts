import { Component, OnInit } from '@angular/core';
import { CategorieService } from '../categorie.service';
import { Categorie } from './Categorie';
@Component({
  selector: 'app-categorie',
  templateUrl: './categorie.component.html',
  styleUrls: ['./categorie.component.css']
})
export class CategorieComponent implements OnInit {
  categories: Categorie[] = [];
  selectedCategorie: Categorie | null = null;

  constructor(private categorieService: CategorieService) {}

  ngOnInit(): void {
    this.loadAllCategories();
  }

  loadAllCategories(): void {
    this.categorieService.findAll().subscribe(
      (data) => { this.categories = data; },
      (error) => { console.error(error); }
    );
  }

  saveCategorie(): void {
    if (this.selectedCategorie) {
      // If 'id' is null or 0, the backend should interpret this as a new category
      this.categorieService.save(this.selectedCategorie).subscribe(
        () => {
          this.loadAllCategories();
          this.selectedCategorie = null; // Reset the selected category
        },
        (error) => { console.error(error); }
      );
    }
  }

  updateCategorie(): void {
    if (this.selectedCategorie && this.selectedCategorie.id) {
      this.categorieService.update(this.selectedCategorie.id, this.selectedCategorie).subscribe(
        () => {
          this.loadAllCategories();
          this.selectedCategorie = null;
        },
        (error) => { console.error(error); }
      );
    }
  }

  deleteCategorie(id: number): void {
    this.categorieService.deleteById(id).subscribe(
      () => { this.loadAllCategories(); },
      (error) => { console.error(error); }
    );
  }

  createNewCategorie(): void {
    this.selectedCategorie = new Categorie(0, ''); // Assuming '0' is a placeholder for a new entity
  }

  cancel(): void {
    this.selectedCategorie = null;
  }
}
