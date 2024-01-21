package com.example.taxe.Controller;

import java.util.List;
import java.util.Optional;

import com.example.taxe.Service.CategorieService;
import com.example.taxe.Service.ProprietaireMS;
import com.example.taxe.Service.TerrainService;
import com.example.taxe.entities.Terrain;
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
@RequestMapping("/Terrain")
public class 	TerrainController {
	
	@Autowired
	TerrainService terrainService;
	
	@Autowired
	CategorieService categorieService;
	
	@Autowired
	ProprietaireMS proprietaireService;

	
	@PostMapping("/save")
	public <S extends Terrain> S save(@RequestBody S entity) {
	    return terrainService.save(entity);
	}

	@GetMapping("/findAll")
	public List<Terrain> findAll() {
		return terrainService.findAll();
	}

	@GetMapping("/findById/{id}")
	public Optional<Terrain> findById(@PathVariable Integer id) {
		return terrainService.findById(id);
	}

	@DeleteMapping("/deleteById/{id}")
	public void deleteById(@PathVariable Integer id) {
		terrainService.deleteById(id);
	}
    
    @PutMapping("/update/{id}")
	public ResponseEntity<Terrain> update(@PathVariable int id, @RequestBody Terrain terrain){
		return terrainService.updateTerrain(id, terrain);
	}
    
    @GetMapping("/findByProprietaireCin/{cin}")
    public ResponseEntity<List<Terrain>> findTerrainByProprietaireCIN(@PathVariable String cin) {
        List<Terrain> terrainList = terrainService.findTerrainByProprietaireCin(cin);
        return ResponseEntity.ok(terrainList);
    }
}
