package com.example.taxe.Controller;

import java.util.List;
import java.util.Optional;

import com.example.taxe.Service.TauxService;
import com.example.taxe.entities.Taux;
import org.springframework.beans.factory.annotation.Autowired;
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

@CrossOrigin(origins = "http://localhost:4200/")
@RestController
@RequestMapping("/Taux")
public class TauxController {
	
	@Autowired
	TauxService tauxService;

	@PostMapping("/save")
	public <S extends Taux> S save(@RequestBody S entity) {
		return tauxService.save(entity);
	}
	
	@GetMapping("/findAll")
	public List<Taux> findAll() {
		return tauxService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Taux> findById(@PathVariable Integer id) {
		return tauxService.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable Integer id) {
		tauxService.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<Taux> update(@PathVariable int id, @RequestBody Taux taux){
		return tauxService.updateTaux(id, taux);
	}
	
	@GetMapping("/findByCategorieType/{type}")
    public ResponseEntity<List<Taux>> findTerrainByProprietaireCIN(@PathVariable String type) {
        List<Taux> tauxList = tauxService.findTauxByCategorieType(type);
        return ResponseEntity.ok(tauxList);
    }
	
	
}
