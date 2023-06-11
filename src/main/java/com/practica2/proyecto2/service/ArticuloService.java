package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Articulo;

public interface ArticuloService {
	public Articulo registrar(Articulo a);
	public Articulo actualizar(Articulo a);
	public void eliminar (Articulo a);
	public List<Articulo>consultar();
	
}
