package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Ingreso;
import com.practica2.proyecto2.repository.IngresoRepository;
@Service
public class IngresoServiceImplements implements IngresoService{
	@Autowired
	IngresoRepository x;
	
	public Ingreso registrar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	
	public Ingreso actualizar(Ingreso a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	
	public void eliminar(Ingreso a) {
		// TODO Auto-generated method stub
		return;
	}

	
	public List<Ingreso> consultas() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
