package com.example.credillants.credillants.entity;

import jakarta.persistence.*;

@Entity
@Table(name="userrol")
public class UsuarioRolEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUserRol;
	@ManyToOne(fetch = FetchType.EAGER)
	private UsuarioEntity usuariorol;
	@ManyToOne(fetch = FetchType.EAGER)
	private RolEntity rolusuario;
	
	public Integer getIdUserRol() {
		return idUserRol;
	}
	public void setIdUserRol(Integer idUserRol) {
		this.idUserRol = idUserRol;
	}
	public UsuarioEntity getUsuariorol() {
		return usuariorol;
	}
	public void setUsuariorol(UsuarioEntity usuariorol) {
		this.usuariorol = usuariorol;
	}
	public RolEntity getRolusuario() {
		return rolusuario;
	}
	public void setRolusuario(RolEntity rolusuario) {
		this.rolusuario = rolusuario;
	}
}
