package com.practica2.proyecto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="DetalleVenta")
@Table(name="detalleventa")
public class DetalleVenta {
	@Id
	String iddetalleventa;
	String idventa;
	String adarticulo;
	String cantidad;
	String preciventa;
	String descuento;
	public DetalleVenta() {
		super();
	}
	public DetalleVenta(String iddetalleventa, String idventa, String adarticulo, String cantidad, String preciventa,
			String descuento) {
		super();
		this.iddetalleventa = iddetalleventa;
		this.idventa = idventa;
		this.adarticulo = adarticulo;
		this.cantidad = cantidad;
		this.preciventa = preciventa;
		this.descuento = descuento;
	}
	public String getIddetalleventa() {
		return iddetalleventa;
	}
	public void setIddetalleventa(String iddetalleventa) {
		this.iddetalleventa = iddetalleventa;
	}
	public String getIdventa() {
		return idventa;
	}
	public void setIdventa(String idventa) {
		this.idventa = idventa;
	}
	public String getAdarticulo() {
		return adarticulo;
	}
	public void setAdarticulo(String adarticulo) {
		this.adarticulo = adarticulo;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPreciventa() {
		return preciventa;
	}
	public void setPreciventa(String preciventa) {
		this.preciventa = preciventa;
	}
	public String getDescuento() {
		return descuento;
	}
	public void setDescuento(String descuento) {
		this.descuento = descuento;
	}
	
	
	
}
