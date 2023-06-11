package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Venta;
import com.practica2.proyecto2.repository.VentaRepository;
@Service

public class VentaServiceImplements implements VentaService {
	@Autowired
	VentaRepository x;
	@Override
	public Venta registrar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Venta actualizar(Venta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Venta a) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public List<Venta> Consultas() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
