package com.example.credillants.credillants.entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class LlantaMarcaEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idLlantMarca;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private LlantasEntity llantamarca;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private MarcaEntity marcallanta;

	public Integer getIdLlantMarca() {
		return idLlantMarca;
	}

	public void setIdLlantMarca(Integer idLlantMarca) {
		this.idLlantMarca = idLlantMarca;
	}

	public LlantasEntity getLlantamarca() {
		return llantamarca;
	}

	public void setLlantamarca(LlantasEntity llantamarca) {
		this.llantamarca = llantamarca;
	}

	public MarcaEntity getMarcallanta() {
		return marcallanta;
	}

	public void setMarcallanta(MarcaEntity marcallanta) {
		this.marcallanta = marcallanta;
	}
	
}
