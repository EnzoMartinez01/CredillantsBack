package com.example.credillants.credillants.entity;

import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name="rol")
public class RolEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idRol;
	private String rol;
	
	public Integer getIdRol() {
		return idRol;
	}
	public void setIdRol(Integer idRol) {
		this.idRol = idRol;
	}
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	
	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, mappedBy = "rolusuario")
	private Set<UsuarioRolEntity> usuariorolentity = new HashSet<>();

	public Set<UsuarioRolEntity> getUsuariorolentity() {
		return usuariorolentity;
	}
	public void setUsuariorolentity(Set<UsuarioRolEntity> usuariorolentity) {
		this.usuariorolentity = usuariorolentity;
	}
}
