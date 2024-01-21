package com.example.taxe.Dao;

import java.util.Optional;

import com.example.taxe.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie,Integer>{

}
