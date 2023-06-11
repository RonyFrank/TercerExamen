package com.practica2.proyecto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="Venta")
@Table(name="venta")
public class Venta {
	@Id
	String idventa;
	String idcliente;
	String idusuarios;
	String tipocomprobante;
	String seriecomprobante;
	String numcomprobante;
	String fechahora;
	String impuesto;
	String totalventa;
	String estado;
	public Venta() {
		super();
	}
	public Venta(String idventa, String idcliente, String idusuarios, String tipocomprobante, String seriecomprobante,
			String numcomprobante, String fechahora, String impuesto, String totalventa, String estado) {
		super();
		this.idventa = idventa;
		this.idcliente = idcliente;
		this.idusuarios = idusuarios;
		this.tipocomprobante = tipocomprobante;
		this.seriecomprobante = seriecomprobante;
		this.numcomprobante = numcomprobante;
		this.fechahora = fechahora;
		this.impuesto = impuesto;
		this.totalventa = totalventa;
		this.estado = estado;
	}
	public String getIdventa() {
		return idventa;
	}
	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getIdusuarios() {
		return idusuarios;
	}
	public void setIdusuarios(String idusuarios) {
		this.idusuarios = idusuarios;
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
	public String getTotalventa() {
		return totalventa;
	}
	public void setTotalventa(String totalventa) {
		this.totalventa = totalventa;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
