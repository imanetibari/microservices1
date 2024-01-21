import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { TaxeTnbComponent } from './taxe-tnb/taxe-tnb.component';
import { ProprietaireComponent } from './proprietaire/proprietaire.component';
import { CategorieComponent } from './categorie/categorie.component';

//import { TerrainComponent } from './terrain/terrain.component';

const routes: Routes = [
  { path: 'tax', component: TaxeTnbComponent },
  //{path: 'terrain', component: TerrainComponent },
  { path: 'proprietaire', component: ProprietaireComponent },
  { path: 'Categorie', component: CategorieComponent },

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
