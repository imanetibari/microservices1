package com.example.taxe.Service;

import java.util.List;
import java.util.Optional;

import com.example.taxe.Dao.TauxRepository;
import com.example.taxe.entities.Taux;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TauxService {
	@Autowired
	TauxRepository tauxRepository;

	public <S extends Taux> S save(S entity) {
		return tauxRepository.save(entity);
	}

	public List<Taux> findAll() {
		return tauxRepository.findAll();
	}

	public Optional<Taux> findById(Integer id) {
		return tauxRepository.findById(id);
	}

	public void deleteById(Integer id) {
		tauxRepository.deleteById(id);
	}
	
	public ResponseEntity<Taux> updateTaux(int id, Taux taux) {
	    Optional<Taux> optionalTaux = tauxRepository.findById(id);

	    if (optionalTaux.isPresent()) {
	        Taux existingTaux = optionalTaux.get();
	        existingTaux.setMontant(taux.getMontant());
	        existingTaux.setCategorie(taux.getCategorie());

	        Taux updatedTaux = tauxRepository.save(existingTaux);
	        return ResponseEntity.ok(updatedTaux);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}
	
	public List<Taux> findTauxByCategorieType(String type) {
        return tauxRepository.findByCategorieType(type);
    }
	
	
}
