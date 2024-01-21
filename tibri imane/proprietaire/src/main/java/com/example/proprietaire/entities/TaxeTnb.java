package com.example.proprietaire.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TaxeTnb {
	private Long id;
	private String label;
	private String description;
	private int year;
	private Double montant;
	@ManyToOne
	@Transient
	private Terrain terrain;
	@ManyToOne
	@Transient
	private Proprietaire proprietaire;
	@Transient
	@ManyToOne
	private Categorie categorie;
	@Transient
	@ManyToOne
	private Taux taux;

}
