package com.example.credillants.credillants.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="tipo")
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
	
	@OneToMany(mappedBy = "tipo", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<LlantasEntity> llantas = new LinkedHashSet<>();

	public Set<LlantasEntity> getLlantas() {
		return llantas;
	}
	public void setLlantas(Set<LlantasEntity> llantas) {
		this.llantas = llantas;
	}
	
	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy =
	 * "tipollanta") private Set<LlantaTipoEntity> llantatipoentity = new
	 * HashSet<>();
	 * 
	 * public Set<LlantaTipoEntity> getLlantatipoentity() { return llantatipoentity;
	 * } public void setLlantatipoentity(Set<LlantaTipoEntity> llantatipoentity) {
	 * this.llantatipoentity = llantatipoentity; }
	 */
}
