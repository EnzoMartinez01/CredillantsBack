package com.example.credillants.credillants.service;

import java.util.Set;

import org.springframework.stereotype.Service;

import com.example.credillants.credillants.entity.TipoEntity;

@Service
public interface TipoService {
	
	TipoEntity agregarTipo(TipoEntity tipo);
	
	TipoEntity actualizarTipo(TipoEntity tipo);
	
	Set<TipoEntity> obtenerTipos();
	
	TipoEntity obtenerTipo(Integer idTipo);
	
	void eliminarTipo(Integer idTipo);
}
