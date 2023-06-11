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

import com.practica2.proyecto2.entity.DetalleVenta;

import com.practica2.proyecto2.service.DetalleVentaService;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVenteController {
	@Autowired
	DetalleVentaService m;
	
	@PostMapping
	public DetalleVenta registrar(@RequestBody DetalleVenta a) {
		return m.registrar(a);
		
	}
	@PutMapping
	public DetalleVenta actualizar(@RequestBody DetalleVenta a) {
		return m.actualizar(a);
		
	}
	@DeleteMapping
	public void eliminar(@RequestBody DetalleVenta a) {
		m.eliminar(a);
		
	}
	@GetMapping
	public List<DetalleVenta>consultar(){
		return m.consultar();
		
	}
}
