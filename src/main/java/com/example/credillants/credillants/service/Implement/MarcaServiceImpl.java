package com.example.credillants.credillants.service.Implement;

import java.util.LinkedHashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.credillants.credillants.entity.MarcaEntity;
import com.example.credillants.credillants.repository.MarcarRepository;
import com.example.credillants.credillants.service.MarcaService;

@Service
public class MarcaServiceImpl implements MarcaService{
	@Autowired
	private MarcarRepository marcaRepository;
	
	@Override
	public MarcaEntity agregarMarca(MarcaEntity marca) {
		return marcaRepository.save(marca);
	}
	
	@Override
	public MarcaEntity actualizarMarca(MarcaEntity marca) {
		return marcaRepository.save(marca);
	}
	
	@Override
	public Set<MarcaEntity> obtenerMarcas(){
		return new LinkedHashSet<>(marcaRepository.findAll());
	}
	
	@Override
	public MarcaEntity obtenerMarca(Integer idMarca) {
		return marcaRepository.findById(idMarca).get();
	}
	
	@Override
	public void eliminarMarca(Integer idMarca) {
		MarcaEntity marca = new MarcaEntity();
		marca.setIdMarca(idMarca);
		marcaRepository.delete(marca);
	}
}
