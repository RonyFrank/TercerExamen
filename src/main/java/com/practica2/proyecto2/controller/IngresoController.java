package com.practica2.proyecto2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practica2.proyecto2.entity.Ingreso;
import com.practica2.proyecto2.service.IngresoService;

@RestController
@RequestMapping("/ingreso")
public class IngresoController {
	@Autowired
	IngresoService m;
	
	@PostMapping
	public Ingreso registrar(@RequestBody Ingreso a) {
		return m.registrar(a);
		
	}
	@PutMapping
	public Ingreso actualizar(@RequestBody Ingreso a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Ingreso a) {
		m.eliminar(a);
		
	}
	@GetMapping
	public List<Ingreso>consultar(){
		return m.consultas();
		
	}
	

}
