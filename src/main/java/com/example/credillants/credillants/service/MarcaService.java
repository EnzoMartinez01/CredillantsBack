package com.example.credillants.credillants.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.credillants.credillants.entity.MarcaEntity;

@Service
public interface MarcaService {
	
	MarcaEntity agregarMarca(MarcaEntity marca);
	
	MarcaEntity actualizarMarca(MarcaEntity marca);
	
	Set<MarcaEntity> obtenerMarcas();
	
	MarcaEntity obtenerMarca(Integer idMarca);
	
	void eliminarMarca(Integer idMarca);
}
