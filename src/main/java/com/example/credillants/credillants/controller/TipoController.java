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

import com.example.credillants.credillants.entity.TipoEntity;
import com.example.credillants.credillants.service.TipoService;

@RestController
@RequestMapping("/tipollanta")
public class TipoController {
	@Autowired
	private TipoService tipoService;
	
	@PostMapping("/agregar")
	public ResponseEntity<TipoEntity> guardarTipo(@RequestBody TipoEntity tipo){
		TipoEntity tipoGuardado = tipoService.agregarTipo(tipo);
		return ResponseEntity.ok(tipoGuardado);
	}
	
	@GetMapping("/{idTipo}")
	public TipoEntity listarTipopPorId(@PathVariable("idTipo") Integer idTipo){
		return tipoService.obtenerTipo(idTipo);
	}
	
	@GetMapping("/obtenertipos")
	public ResponseEntity<?> listarTipos(){
		return ResponseEntity.ok(tipoService.obtenerTipos());
	}
	
	@DeleteMapping("/eliminar/{idTipo}")
	public void eliminarTipo(@PathVariable("idTipo") Integer idTipo) {
		tipoService.eliminarTipo(idTipo);
	}
}
