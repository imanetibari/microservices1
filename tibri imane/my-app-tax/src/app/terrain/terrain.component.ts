/*import { Component, OnInit } from '@angular/core';
import { TerrainService } from '../terrain.service'; // Adjust the path as necessary
import { Terrain } from './Terrain';

@Component({
  selector: 'app-terrain',
  templateUrl: './terrain.component.html',
  styleUrls: ['./terrain.component.css']
})
export class TerrainComponent implements OnInit {
  terrains: Terrain[] = [];
  selectedTerrain?: Terrain; // Used for editing

  constructor(private terrainService: TerrainService) { }

  ngOnInit(): void {
    this.getAllTerrains();
  }

  getAllTerrains(): void {
    this.terrainService.findAll().subscribe(
      (data) => this.terrains = data,
      (error) => console.error(error)
    );
  }

  deleteTerrain(id: number): void {
    this.terrainService.deleteById(id).subscribe(
      () => {
        console.log('Terrain deleted');
        this.getAllTerrains(); // Refresh the list
      },
      (error) => console.error(error)
    );
  }

  selectTerrainForEdit(terrain: Terrain): void {
    this.selectedTerrain = Object.assign({}, terrain); // Clone the object for editing
  }

  updateTerrain(): void {
    if (this.selectedTerrain && this.selectedTerrain.getId() != null) {
      this.terrainService.update(this.selectedTerrain.getId(), this.selectedTerrain).subscribe(
        () => {
          console.log('Terrain updated');
          this.getAllTerrains(); // Refresh the list
          this.selectedTerrain = undefined; // Clear selection
        },
        (error) => console.error(error)
      );
    }
  }
}
*/