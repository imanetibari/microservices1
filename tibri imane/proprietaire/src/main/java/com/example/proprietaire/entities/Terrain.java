package com.example.proprietaire.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Terrain {

	private int id;
	private int surface;

	@ManyToOne
	@Transient
	private Proprietaire proprietaire;

	@ManyToOne
	@Transient
	private Categorie categorie;

}
