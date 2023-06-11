package com.practica2.proyecto2.service;

import java.util.List;

import com.practica2.proyecto2.entity.Usuarios;

public interface UsuariosService {
	public Usuarios registrar(Usuarios a);
	public Usuarios actualizar(Usuarios a);
	public void eliminar (Usuarios a);
	public List<Usuarios>consultar();
}
