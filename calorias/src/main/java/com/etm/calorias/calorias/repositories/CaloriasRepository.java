package com.etm.calorias.calorias.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etm.calorias.calorias.entitys.CaloriasEntity;

public interface CaloriasRepository extends JpaRepository<CaloriasEntity, String> {

	  List<CaloriasEntity> findByNomeAlimento(String nomeAlimento);
}
