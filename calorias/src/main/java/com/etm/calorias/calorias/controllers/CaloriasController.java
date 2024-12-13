package com.etm.calorias.calorias.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calorias")
public class CaloriasController {

	@GetMapping(produces = "application/json")
    public ResponseEntity<List<String>> findAll(){
     List<String> listaCalorias = new ArrayList<String>();
     listaCalorias.add("Maça - 100 gramas - 52 calorias");
     
     
     return new ResponseEntity<>(listaCalorias, HttpStatus.OK);
    }
}
