package com.example.proprietaire.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Taux {
	private int id;
	private double montant;
	@ManyToOne
	@Transient
	private Categorie categorie;

}
