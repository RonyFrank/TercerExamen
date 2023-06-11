package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Venta;

public interface VentaService {
	public Venta registrar(Venta a);
	public Venta actualizar(Venta a);
	public void eliminar (Venta a);
	public List<Venta>Consultas();
}
