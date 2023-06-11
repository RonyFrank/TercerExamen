package com.practica2.proyecto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Ingreso")
@Table(name="ingreso")
public class Ingreso {
	@Id
	String idingreso;
	String idproveedor;
	String tipocomprobante;
	String seriecomprobante;
	String numcomprobante;
	String fechahora;
	String impuesto;
	String estado;
	public Ingreso() {
		super();
	}
	public Ingreso(String idingreso, String idproveedor, String tipocomprobante, String seriecomprobante,
			String numcomprobante, String fechahora, String impuesto, String estado) {
		super();
		this.idingreso = idingreso;
		this.idproveedor = idproveedor;
		this.tipocomprobante = tipocomprobante;
		this.seriecomprobante = seriecomprobante;
		this.numcomprobante = numcomprobante;
		this.fechahora = fechahora;
		this.impuesto = impuesto;
		this.estado = estado;
	}
	public String getIdingreso() {
		return idingreso;
	}
	public void setIdingreso(String idingreso) {
		this.idingreso = idingreso;
	}
	public String getIdproveedor() {
		return idproveedor;
	}
	public void setIdproveedor(String idproveedor) {
		this.idproveedor = idproveedor;
	}
	public String getTipocomprobante() {
		return tipocomprobante;
	}
	public void setTipocomprobante(String tipocomprobante) {
		this.tipocomprobante = tipocomprobante;
	}
	public String getSeriecomprobante() {
		return seriecomprobante;
	}
	public void setSeriecomprobante(String seriecomprobante) {
		this.seriecomprobante = seriecomprobante;
	}
	public String getNumcomprobante() {
		return numcomprobante;
	}
	public void setNumcomprobante(String numcomprobante) {
		this.numcomprobante = numcomprobante;
	}
	public String getFechahora() {
		return fechahora;
	}
	public void setFechahora(String fechahora) {
		this.fechahora = fechahora;
	}
	public String getImpuesto() {
		return impuesto;
	}
	public void setImpuesto(String impuesto) {
		this.impuesto = impuesto;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
	
}
