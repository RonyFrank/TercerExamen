package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Usuarios;
import com.practica2.proyecto2.repository.UsuariosRepository;
@Service

public class UsuariosServiceImplements implements UsuariosService {
	@Autowired
	UsuariosRepository x;
	@Override
	public Usuarios registrar(Usuarios a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Usuarios actualizar(Usuarios a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Usuarios a) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public List<Usuarios> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
