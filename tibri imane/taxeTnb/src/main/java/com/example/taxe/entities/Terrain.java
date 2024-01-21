package com.example.taxe.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Terrain {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private int surface;

	@ManyToOne
	@Transient
	private Proprietaire proprietaire;
	private String proprietairecin;

	@ManyToOne
	private Categorie categorie;

}
