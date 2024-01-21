import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HttpClientModule } from '@angular/common/http';
import { TaxeTnbComponent } from './taxe-tnb/taxe-tnb.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProprietaireComponent } from './proprietaire/proprietaire.component';
import { CategorieComponent } from './categorie/categorie.component';
import { FormsModule } from '@angular/forms';
import { CategorieService } from './categorie.service';


@NgModule({
  declarations: [
    AppComponent,
    TaxeTnbComponent,
    NavbarComponent,
    ProprietaireComponent,
    CategorieComponent,
    //TerrainComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule
  ],
  providers: [CategorieService],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
