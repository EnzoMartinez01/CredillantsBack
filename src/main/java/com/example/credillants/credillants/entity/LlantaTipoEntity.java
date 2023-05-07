package com.example.credillants.credillants.entity;

import jakarta.persistence.*;

@Entity
@Table(name="")
public class LlantaTipoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer IdLlanTipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private LlantasEntity llantatipo;
	
	@ManyToOne(fetch = FetchType.EAGER)
	private TipoEntity tipollanta;

	public Integer getIdLlanTipo() {
		return IdLlanTipo;
	}

	public void setIdLlanTipo(Integer idLlanTipo) {
		IdLlanTipo = idLlanTipo;
	}

	public LlantasEntity getLlantatipo() {
		return llantatipo;
	}

	public void setLlantatipo(LlantasEntity llantatipo) {
		this.llantatipo = llantatipo;
	}

	public TipoEntity getTipollanta() {
		return tipollanta;
	}

	public void setTipollanta(TipoEntity tipollanta) {
		this.tipollanta = tipollanta;
	}
}
