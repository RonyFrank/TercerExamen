package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Detalleingreso;
import com.practica2.proyecto2.repository.DetalleIngresoRepository;
@Service
public class DetalleIngresoServiceImplements implements DetalleIngresoService {
	@Autowired
	DetalleIngresoRepository x;
	@Override
	public Detalleingreso registrar(Detalleingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Detalleingreso actualizar(Detalleingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Detalleingreso a) {
		return;
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Detalleingreso> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
