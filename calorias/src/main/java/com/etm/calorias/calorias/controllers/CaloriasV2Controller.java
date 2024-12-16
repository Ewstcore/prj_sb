package com.etm.calorias.calorias.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etm.calorias.calorias.entitys.CaloriasEntity;
import com.etm.calorias.calorias.repositories.CaloriasRepository;
import com.etm.calorias.calorias.services.CaloriasService;

@RestController
@RequestMapping("/api/v2")

public class CaloriasV2Controller {

	org.slf4j.Logger logger = LoggerFactory.getLogger(CaloriasV2Controller.class);
	 
	@Autowired
	private CaloriasService caloriasService;
	

	@RequestMapping("/calorias/{nomeAlimento}")
	@GetMapping(produces = "application/json")
    public ResponseEntity<List<CaloriasEntity>> findAlimento(@PathVariable String nomeAlimento){
    List<String> listaCalorias = new ArrayList<String>();
     
    List<CaloriasEntity> lstRetorno = caloriasService.buscarCalorias(nomeAlimento);
    
    logger.info("metodo -findAlimento");
     
     return new ResponseEntity<>(lstRetorno, HttpStatus.OK);
    }
}
