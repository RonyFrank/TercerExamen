package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.DetalleVenta;
import com.practica2.proyecto2.repository.DetalleVentaRepository;
@Service

public class DetalleVentaServiceImplements implements DetalleVentaService {
	@Autowired
	DetalleVentaRepository x;
	public DetalleVenta registrar(DetalleVenta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	
	public DetalleVenta actualizar(DetalleVenta a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	
	public void eliminar(DetalleVenta a) {
		// TODO Auto-generated method stub
		return;
	}

	
	public List<DetalleVenta> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
