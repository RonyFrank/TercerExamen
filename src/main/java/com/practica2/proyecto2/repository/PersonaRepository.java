package com.practica2.proyecto2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practica2.proyecto2.entity.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, String>  {

}
