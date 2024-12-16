package com.etm.calorias.calorias.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.etm.calorias.calorias.repositories.CaloriasRepository;

@Service
public class CaloriasService<CaloriasEntity> {
	
	@Autowired
	private CaloriasRepository caloriasRepository;
	
	public List<CaloriasEntity> buscarCalorias(String nomeAlimento) {
		
		return (List<CaloriasEntity>) caloriasRepository.findByNomeAlimento(nomeAlimento);
	}
}
