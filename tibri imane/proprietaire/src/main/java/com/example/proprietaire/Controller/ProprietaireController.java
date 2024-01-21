package com.example.proprietaire.Controller;

import java.util.List;
import java.util.Optional;

import com.example.proprietaire.Service.ProprietaireService;
import com.example.proprietaire.entities.Proprietaire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200" , allowedHeaders = "*")
@RestController
@RequestMapping("/proprietaire")
public class ProprietaireController {
	
	@Autowired
	ProprietaireService proprietaireService;

	@PostMapping("/save")
	public <S extends Proprietaire> S save(@RequestBody S entity) {
		return proprietaireService.save(entity);
	}

				@GetMapping("/findAll")
	public List<Proprietaire> findAll(Sort sort) {
		return proprietaireService.findAll(sort);
	}
	
	@GetMapping("/findById/{id}")
	public Optional<Proprietaire> findById(@PathVariable Integer id) {
		return proprietaireService.findById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Integer id) {
		proprietaireService.deleteById(id);
	}

	@GetMapping("/findByCin/{cin}")
	public Proprietaire findByCin(@PathVariable String cin) {
		return proprietaireService.findByCin(cin);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Proprietaire> update(@PathVariable int id, @RequestBody Proprietaire proprietaire){
		return proprietaireService.updateProprietaire(id, proprietaire);
	}
	
}
