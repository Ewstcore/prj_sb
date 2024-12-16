package com.etm.calorias.calorias.entitys;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "calorias")
public class CaloriasEntity {

	@Id
	private Long id;
	private String nomeAlimento;
	private int calorias;
	private int gramas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeAlimento() {
		return nomeAlimento;
	}

	public void setNomeAlimento(String nomeAlimento) {
		this.nomeAlimento = nomeAlimento;
	}

	public int getCalorias() {
		return calorias;
	}

	public void setCalorias(int calorias) {
		this.calorias = calorias;
	}

	public int getGramas() {
		return gramas;
	}

	public void setGramas(int gramas) {
		this.gramas = gramas;
	}

}
