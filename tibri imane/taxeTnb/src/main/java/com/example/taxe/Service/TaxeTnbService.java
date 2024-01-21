package com.example.taxe.Service;

import java.util.List;
import java.util.Optional;

import com.example.taxe.Dao.TaxeTnbRepository;
import com.example.taxe.entities.TaxeTnb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


@Service
public class TaxeTnbService {
	@Autowired
	TaxeTnbRepository taxetnbRepository;

	public <S extends TaxeTnb> S save(S entity) {
		return taxetnbRepository.save(entity);
	}

	public List<TaxeTnb> findAll() {
		return taxetnbRepository.findAll();
	}

	public Optional<TaxeTnb> findById(Integer id) {
		return taxetnbRepository.findById(id);
	}

	public void deleteById(Integer id) {
		taxetnbRepository.deleteById(id);
	}

	public List<TaxeTnb> findTaxeTnbByProprietaireCIN(String CIN) {
		return taxetnbRepository.findByProprietairecin(CIN);
	}

	public ResponseEntity<TaxeTnb> calculateAndUpdateTaxeTnb(int taxeTnbId) {
		Optional<TaxeTnb> taxeTnbOptional = taxetnbRepository.findById(taxeTnbId);
		if (taxeTnbOptional.isPresent()) {
			TaxeTnb taxeTnb = taxeTnbOptional.get();
			taxeTnb.calculateTax();
			TaxeTnb updatedTaxeTnb = taxetnbRepository.save(taxeTnb);
			return ResponseEntity.ok(updatedTaxeTnb);
		} else {
			return ResponseEntity.notFound().build();
		}
	}


}