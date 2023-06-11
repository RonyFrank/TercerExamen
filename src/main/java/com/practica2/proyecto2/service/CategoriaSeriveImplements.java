package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Categoria;
import com.practica2.proyecto2.repository.CategoriaRepository;
@Service
public class CategoriaSeriveImplements implements CategoriaService {
	@Autowired
	CategoriaRepository x;
	@Override
	public Categoria registrar(Categoria a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Categoria actualizar(Categoria a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Categoria a) {
			
		
	}

	@Override
	public List<Categoria> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
