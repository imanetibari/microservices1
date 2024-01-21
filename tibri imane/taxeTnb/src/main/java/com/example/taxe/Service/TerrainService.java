package com.example.taxe.Service;

import java.util.List;
import java.util.Optional;

import com.example.taxe.Dao.TerrainRepository;
import com.example.taxe.entities.Terrain;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class TerrainService {
	
	@Autowired
	TerrainRepository terrainRepository;

	public <S extends Terrain> S save(S entity) {
		return terrainRepository.save(entity);
	}

	public List<Terrain> findAll() {
		return terrainRepository.findAll();
	}

	public Optional<Terrain> findById(Integer id) {
		return terrainRepository.findById(id);
	}

	public void deleteById(Integer id) {
		terrainRepository.deleteById(id);
	}

	public ResponseEntity<Terrain> updateTerrain(int id, Terrain terrain) {
	    Optional<Terrain> optionalTerrain = terrainRepository.findById(id);

	    if (optionalTerrain.isPresent()) {
	        Terrain existingTerrain = optionalTerrain.get();
	        existingTerrain.setSurface(terrain.getSurface());
	        existingTerrain.setProprietaire(terrain.getProprietaire());
	        existingTerrain.setCategorie(terrain.getCategorie());

	        Terrain updatedTerrain = terrainRepository.save(existingTerrain);
	        return ResponseEntity.ok(updatedTerrain);
	    } else {
	        return ResponseEntity.notFound().build();
	    }
	}

	
	public List<Terrain> findTerrainByProprietaireCin(String cin) {
        return terrainRepository.findByProprietairecin(cin);
    }
	
	
}
