package com.example.credillants.credillants.service.Implement;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.credillants.credillants.entity.TipoEntity;
import com.example.credillants.credillants.repository.TipoRepository;
import com.example.credillants.credillants.service.TipoService;

@Service
public class TipoServiceImpl implements TipoService{
	@Autowired
	private TipoRepository tipoRepository;
	
	@Override
	public TipoEntity agregarTipo(TipoEntity tipo) {
		return tipoRepository.save(tipo);
	}
	
	@Override
	public TipoEntity actualizarTipo(TipoEntity tipo) {
		return tipoRepository.save(tipo);
	}
	
	@Override
	public Set<TipoEntity> obtenerTipos(){
		return new LinkedHashSet<>(tipoRepository.findAll());
	}
	
	@Override
	public TipoEntity obtenerTipo(Integer idTipo) {
		return tipoRepository.findById(idTipo).get();
	}
	
	@Override
	public void eliminarTipo(Integer idTipo) {
		TipoEntity tipo = new TipoEntity();
		tipo.setIdTipo(idTipo);
		tipoRepository.delete(tipo);
	}
}
