package com.practica2.proyecto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Persona")
@Table(name="persona")
public class Persona {
	@Id
	String idpersona;
	String nombre;
	String tipodocumento;
	String numdocumento;
	String direccion;
	String telefono;
	String email;
	public Persona() {
		super();
	}
	public Persona(String idpersona, String nombre, String tipodocumento, String numdocumento, String direccion,
			String telefono, String email) {
		super();
		this.idpersona = idpersona;
		this.nombre = nombre;
		this.tipodocumento = tipodocumento;
		this.numdocumento = numdocumento;
		this.direccion = direccion;
		this.telefono = telefono;
		this.email = email;
	}
	public String getIdpersona() {
		return idpersona;
	}
	public void setIdpersona(String idpersona) {
		this.idpersona = idpersona;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getTipodocumento() {
		return tipodocumento;
	}
	public void setTipodocumento(String tipodocumento) {
		this.tipodocumento = tipodocumento;
	}
	public String getNumdocumento() {
		return numdocumento;
	}
	public void setNumdocumento(String numdocumento) {
		this.numdocumento = numdocumento;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	

}
