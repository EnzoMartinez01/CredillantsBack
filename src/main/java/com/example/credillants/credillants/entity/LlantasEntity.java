package com.example.credillants.credillants.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class LlantasEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLlanta;
	private Integer diametro;
	private String aro;
	private Integer ancho;
	private Float precio;
	
	public Integer getIdLlanta() {
		return idLlanta;
	}
	public void setIdLlanta(Integer idLlanta) {
		this.idLlanta = idLlanta;
	}
	public Integer getDiametro() {
		return diametro;
	}
	public void setDiametro(Integer diametro) {
		this.diametro = diametro;
	}
	public String getAro() {
		return aro;
	}
	public void setAro(String aro) {
		this.aro = aro;
	}
	public Integer getAncho() {
		return ancho;
	}
	public void setAncho(Integer ancho) {
		this.ancho = ancho;
	}
	public Float getPrecio() {
		return precio;
	}
	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	@ManyToOne (fetch = FetchType.EAGER)
	private TipoEntity idTipo;
	
	@ManyToOne (fetch = FetchType.EAGER)
	private MarcaEntity idMarca;

	public TipoEntity getIdTipo() {
		return idTipo;
	}
	public void setIdTipo(TipoEntity idTipo) {
		this.idTipo = idTipo;
	}
	public MarcaEntity getIdMarca() {
		return idMarca;
	}
	public void setIdMarca(MarcaEntity idMarca) {
		this.idMarca = idMarca;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "llantatipo")
	@JsonIgnore
	private Set<LlantaTipoEntity> llantatipoentity = new HashSet<>();

	public Set<LlantaTipoEntity> getLlantatipoentity() {
		return llantatipoentity;
	}
	public void setLlantatipoentity(Set<LlantaTipoEntity> llantatipoentity) {
		this.llantatipoentity = llantatipoentity;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "llantamarca")
	@JsonIgnore
	private Set<LlantaMarcaEntity> llantamarcaentity = new HashSet<>();

	public Set<LlantaMarcaEntity> getLlantamarcaentity() {
		return llantamarcaentity;
	}
	public void setLlantamarcaentity(Set<LlantaMarcaEntity> llantamarcaentity) {
		this.llantamarcaentity = llantamarcaentity;
	}
	
}
