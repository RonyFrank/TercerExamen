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

import com.practica2.proyecto2.entity.Usuarios;
import com.practica2.proyecto2.service.UsuariosService;

@RestController
@RequestMapping("/usuarios")

public class UsuariosController {
	@Autowired
	UsuariosService m;
	
	@PostMapping
	public Usuarios registrar(@RequestBody Usuarios a) {
		return m.registrar(a);
		
	}
	@PutMapping
	
	public Usuarios actualizar(@RequestBody Usuarios a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Usuarios a) {
		m.eliminar(a);
	}
	@GetMapping
	public List<Usuarios>consultas(){
		return m.consultar();
		
	}

}
