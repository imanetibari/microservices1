package com.example.taxe.Dao;

import java.util.List;

import com.example.taxe.entities.Terrain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TerrainRepository extends JpaRepository<Terrain,Integer>{
	
	List<Terrain> findByProprietairecin(String cin);
	
}
