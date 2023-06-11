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

import com.practica2.proyecto2.entity.Categoria;
import com.practica2.proyecto2.service.CategoriaService;

@RestController
@RequestMapping("/categoria")
public class CategoriaController {
	
	@Autowired
	CategoriaService m;
	
	@PostMapping
	public Categoria registrar(@RequestBody Categoria a) {
		return m.registrar(a);
		
	}
	@PutMapping
	public Categoria actualizar(@RequestBody Categoria a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void  eliminar(@RequestBody Categoria a) {
		m.eliminar(a);
	}
	
	@GetMapping
	public List<Categoria>consultar(){
		return m.consultar();
		
	}

}
