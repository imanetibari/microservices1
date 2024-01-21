package com.example.taxe.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proprietaire {
	private int id;
	private String nom;
	private String prenom;
	private String cin;
	private String password;
}
