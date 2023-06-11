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

import com.practica2.proyecto2.entity.Persona;
import com.practica2.proyecto2.service.PersonaService;



@RestController
@RequestMapping("/persona")

public class PersonaController {
	@Autowired
	PersonaService m;
	
	@PostMapping
	public Persona registrar(@RequestBody Persona a) {
		return m.registrar(a);
		
	}
	@PutMapping
	public Persona actualizar(@RequestBody Persona a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Persona a) {
		m.eliminar(a);
	}
	@GetMapping
	public List<Persona>consultas(){
		return m.consultar();
		
	}
}
