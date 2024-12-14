package com.etm.calorias.calorias.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")

public class CaloriasController {

	@RequestMapping("/calorias")
	@GetMapping(produces = "application/json")
    public ResponseEntity<List<String>> findAll(){
     List<String> listaCalorias = new ArrayList<String>();
     listaCalorias.add("Maça - 100 gramas - 52 calorias");
     
     
     return new ResponseEntity<>(listaCalorias, HttpStatus.OK);
    }
	
	
	@RequestMapping("/calorias/{nomeAlimento}")
	@GetMapping(produces = "application/json")
    public ResponseEntity<List<String>> findAlimento(@PathVariable String nomeAlimento){
    List<String> listaCalorias = new ArrayList<String>();
     
     
     if (nomeAlimento.equals("maça")) {
    	 listaCalorias.add("Maça - 100 gramas - 52 calorias");
     } else if (nomeAlimento.equals("pera")) {
    	 listaCalorias.add("Pera - 100 gramas - 57 calorias");
     } else if (nomeAlimento.equals("coco")) {
    	 listaCalorias.add("Coco - 100 gramas - 354 calorias");
     } else {
    	 listaCalorias.add(nomeAlimento + " não localizado");
     }
     
     return new ResponseEntity<>(listaCalorias, HttpStatus.OK);
    }
}
