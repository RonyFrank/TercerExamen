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

import com.practica2.proyecto2.entity.Articulo;
import com.practica2.proyecto2.service.ArticuloService;
@RestController
@RequestMapping("/articulo")

public class ArticuloController {
	@Autowired
	ArticuloService m;
	
	@PostMapping
	public Articulo registrarArticulo(@RequestBody Articulo a) {
		return m.registrar(a);
		

	}
	@PutMapping
	public Articulo actualizarArticulo(@RequestBody Articulo a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void  eliminar(@RequestBody Articulo a) {
		m.eliminar(a);
		
	}
	@GetMapping
	public List<Articulo> consultar(@RequestBody Articulo a) {
		return m.consultar();
		
	}
}

