package com.example.credillants.credillants.entity;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.*;

@Entity
@Table(name="")
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
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "marcallanta")
	private Set<LlantaMarcaEntity> llantamarcaentity = new HashSet<>();

	public Set<LlantaMarcaEntity> getLlantamarcaentity() {
		return llantamarcaentity;
	}
	public void setLlantamarcaentity(Set<LlantaMarcaEntity> llantamarcaentity) {
		this.llantamarcaentity = llantamarcaentity;
	}
}
