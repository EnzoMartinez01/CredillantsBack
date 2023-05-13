package com.example.credillants.credillants.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.credillants.credillants.entity.UsuarioEntity;
import com.example.credillants.credillants.repository.UsuarioRepository;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
	@Autowired
	private UsuarioRepository userRepo;
	
	@GetMapping("/listarusuarios")
	public List<UsuarioEntity> listarUsuarios(){
		return(List<UsuarioEntity>) userRepo.findAll();
	}
	
	@PostMapping("/crearusuario")
	public void crearCuentaUsuario(@RequestBody UsuarioEntity UsuEnt) {
		userRepo.save(UsuEnt);
	}
	
	@PutMapping("/editarusuario")
	public void actualizarUusario(@RequestBody UsuarioEntity UsuEnt) {
		userRepo.save(UsuEnt);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminarUsuario (@PathVariable ("id") Integer idUsuario) {
		userRepo.deleteById(idUsuario);
	}
}
