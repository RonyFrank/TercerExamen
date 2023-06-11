package com.practica2.proyecto2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practica2.proyecto2.entity.Persona;
import com.practica2.proyecto2.repository.PersonaRepository;
@Service
public class PersonaServiceImplements implements PersonaService{
	@Autowired
	PersonaRepository x;
	@Override
	public Persona registrar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public Persona actualizar(Persona a) {
		// TODO Auto-generated method stub
		return x.save(a);
	}

	@Override
	public void eliminar(Persona a) {
		// TODO Auto-generated method stub
		return;
	}

	@Override
	public List<Persona> consultar() {
		// TODO Auto-generated method stub
		return x.findAll();
	}

}
