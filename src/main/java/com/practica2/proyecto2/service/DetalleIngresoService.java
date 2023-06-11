package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Detalleingreso;

public interface DetalleIngresoService {
	public Detalleingreso registrar(Detalleingreso a);
	public Detalleingreso actualizar(Detalleingreso a);
	public void eliminar (Detalleingreso a);
	public List<Detalleingreso>consultar();
}
