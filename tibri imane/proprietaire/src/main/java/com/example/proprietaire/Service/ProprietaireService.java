package com.example.proprietaire.Service;

import java.util.List;
import java.util.Optional;

import com.example.proprietaire.Dao.ProprietaireRepository;
import com.example.proprietaire.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ProprietaireService {
	@Autowired
	ProprietaireRepository proprietaireRepository;

	public <S extends Proprietaire> S save(S entity) {
		return proprietaireRepository.save(entity);
	}

	public List<Proprietaire> findAll(Sort sort) {
		return proprietaireRepository.findAll(sort);
	}

	public Optional<Proprietaire> findById(Integer id) {
		return proprietaireRepository.findById(id);
	}

	public void deleteById(Integer id) {
		proprietaireRepository.deleteById(id);
	}

	public Proprietaire findByCin(String Cin) {
		return proprietaireRepository.findByCin(Cin);
	}
	
	public ResponseEntity<Proprietaire> updateProprietaire(int id, Proprietaire proprietaire) {
	    Optional<Proprietaire> optionalProprietaire = proprietaireRepository.findById(id);
	    if (optionalProprietaire.isPresent()) {
	    	Proprietaire existingProprietaire = optionalProprietaire.get();
	    	existingProprietaire.setNom(proprietaire.getNom());
	    	existingProprietaire.setPrenom(proprietaire.getPrenom());
	    	existingProprietaire.setCin(proprietaire.getCin());
	        Proprietaire updateProprietaire = proprietaireRepository.save(existingProprietaire);
	        return ResponseEntity.ok(updateProprietaire);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

}
