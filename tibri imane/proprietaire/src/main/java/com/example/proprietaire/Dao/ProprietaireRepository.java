package com.example.proprietaire.Dao;

import com.example.proprietaire.entities.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProprietaireRepository extends JpaRepository<Proprietaire,Integer>{
	
	Proprietaire findByCin(String Cin);
}
