package com.example.taxe.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class TaxeTnb {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private String label;
	private String description;
	private int year;
	private Double montant;
	@ManyToOne
	private Terrain terrain;
	@ManyToOne
	@Transient
	private Proprietaire proprietaire;
	private String proprietairecin;

	@ManyToOne
	private Categorie categorie;
	@ManyToOne
	private Taux taux;


		public void calculateTax() {
			if (this.taux != null && this.terrain != null) {
				this.montant = this.taux.getMontant() * this.terrain.getSurface();
			}
		}



}
