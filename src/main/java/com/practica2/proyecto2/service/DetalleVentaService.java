package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.DetalleVenta;

public interface DetalleVentaService {
	public DetalleVenta registrar(DetalleVenta a);
	public DetalleVenta actualizar(DetalleVenta a);
	public void eliminar (DetalleVenta a);
	public List<DetalleVenta>consultar();

}
