package com.example.taxe.entities;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Taux {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private int id;
	private double montant;
	@ManyToOne
	private Categorie categorie;

}
