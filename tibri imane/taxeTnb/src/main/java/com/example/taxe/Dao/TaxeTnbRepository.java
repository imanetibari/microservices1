package com.example.taxe.Dao;

import java.util.List;

import com.example.taxe.entities.TaxeTnb;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaxeTnbRepository extends JpaRepository<TaxeTnb,Integer>{
	
	List<TaxeTnb> findByProprietairecin(String cin);

}
