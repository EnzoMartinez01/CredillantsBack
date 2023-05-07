package com.example.credillants.credillants.entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class TipoEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private Integer idTipo;
	private String tipo;
	
	public Integer getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(Integer idTipo) {
		this.idTipo = idTipo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "tipollanta")
	private Set<LlantaTipoEntity> llantatipoentity = new HashSet<>();

	public Set<LlantaTipoEntity> getLlantatipoentity() {
		return llantatipoentity;
	}
	public void setLlantatipoentity(Set<LlantaTipoEntity> llantatipoentity) {
		this.llantatipoentity = llantatipoentity;
	}
}
