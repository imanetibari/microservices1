package com.example.taxe.Service;

import com.example.taxe.entities.Proprietaire;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="EUREKA-PROPRI")
public interface ProprietaireMS {

    @GetMapping(path ="/proprietaire/findByCin/{cin}")
    Proprietaire getProprietaireByCin(@PathVariable("cin") String id);

}