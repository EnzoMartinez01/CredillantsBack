package com.example.credillants.credillants.entity;

import java.util.LinkedHashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="marca")
public class MarcaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMarca;
	private String nombmarca;
	
	public Integer getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(Integer idMarca) {
		this.idMarca = idMarca;
	}
	public String getNombmarca() {
		return nombmarca;
	}
	public void setNombmarca(String nombmarca) {
		this.nombmarca = nombmarca;
	}
	
	@OneToMany(mappedBy = "marca", cascade = CascadeType.ALL)
	@JsonIgnore
	private Set<LlantasEntity> llantas = new LinkedHashSet<>();

	public Set<LlantasEntity> getLlantas() {
		return llantas;
	}
	public void setLlantas(Set<LlantasEntity> llantas) {
		this.llantas = llantas;
	}

}
