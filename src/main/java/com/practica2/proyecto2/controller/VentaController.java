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

import com.practica2.proyecto2.entity.Venta;
import com.practica2.proyecto2.service.VentaService;

@RestController
@RequestMapping("/venta")

public class VentaController {
	@Autowired
	VentaService m;
	
	@PostMapping
	public Venta registrar(@RequestBody Venta a) {
		return m.registrar(a);
		
	}
	@PutMapping
	public Venta actualizar(@RequestBody Venta a) {
		return m.registrar(a);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody Venta a) {
		m.eliminar(a);
	}
	@GetMapping
	public List<Venta>consultar(){
		return m.Consultas();
		
	}
	
}
