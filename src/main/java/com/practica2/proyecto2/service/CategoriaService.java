package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Categoria;

public interface CategoriaService {
	public Categoria registrar(Categoria a);
	public Categoria actualizar(Categoria a);
	public void eliminar (Categoria a);
	public List<Categoria>consultar();

}
