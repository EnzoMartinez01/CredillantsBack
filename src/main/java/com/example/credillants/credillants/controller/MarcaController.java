package com.example.credillants.credillants.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.credillants.credillants.entity.MarcaEntity;
import com.example.credillants.credillants.service.MarcaService;

@RestController
@RequestMapping("/marca")
public class MarcaController {

	@Autowired
	private MarcaService marcaService;
	
	@PostMapping("/agregar")
	public ResponseEntity<MarcaEntity> guardarMarca(@RequestBody MarcaEntity marca){
		MarcaEntity marcaGuardado = marcaService.agregarMarca(marca);
		return ResponseEntity.ok(marcaGuardado);
	}
	
	@GetMapping("/{idMarca}")
	public MarcaEntity listarMarcaPorId(@PathVariable("idMarca") Integer idMarca) {
		return marcaService.obtenerMarca(idMarca);
	}
	
	@GetMapping("/obtenermarcas")
	public ResponseEntity<?> listarMarcas(){
		return ResponseEntity.ok(marcaService.obtenerMarcas());
	}
	
	@DeleteMapping("/eliminar/{idMarca}")
	public void eliminarTipo(@PathVariable("idMarca") Integer idMarca) {
		marcaService.eliminarMarca(idMarca);
	}
}
