package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Ingreso;

public interface IngresoService {
	public Ingreso registrar(Ingreso a);
	public Ingreso actualizar(Ingreso a);
	public void eliminar (Ingreso a);
	public List<Ingreso>consultas();
}
