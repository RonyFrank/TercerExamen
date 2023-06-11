package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Persona;

public interface PersonaService {
	public Persona registrar(Persona a);
	public Persona actualizar(Persona a);
	public void eliminar (Persona a);
	public List<Persona>consultar();
}
