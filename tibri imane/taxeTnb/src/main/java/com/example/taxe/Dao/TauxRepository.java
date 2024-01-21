package com.example.taxe.Dao;

import java.util.List;

import com.example.taxe.entities.Taux;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TauxRepository extends JpaRepository<Taux,Integer>{
	
	List<Taux> findByCategorieType(String type);

}
