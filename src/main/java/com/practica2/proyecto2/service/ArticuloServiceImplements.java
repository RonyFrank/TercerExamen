package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Articulo;
import com.practica2.proyecto2.repository.ArticuloRepository;

@Service
public class ArticuloServiceImplements implements ArticuloService {
	@Autowired
	
	ArticuloRepository x;
	
	@Override
	public Articulo registrar(Articulo a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Articulo actualizar(Articulo a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Articulo a) {
		
	}

	@Override
	public List<Articulo> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
