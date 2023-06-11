package com.practica2.proyecto2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity(name="DetalleIngreso")
@Table(name="detalleingreso")
public class Detalleingreso {
		@Id
		String iddetalleingreso;
		String idingreso;
		String idarticulo;
		String cantidad;
		String preciocompra;
		String precioventa;
		public Detalleingreso() {
			super();
		}
		public Detalleingreso(String iddetalleingreso, String idingreso, String idarticulo, String cantidad,
				String preciocompra, String precioventa) {
			super();
			this.iddetalleingreso = iddetalleingreso;
			this.idingreso = idingreso;
			this.idarticulo = idarticulo;
			this.cantidad = cantidad;
			this.preciocompra = preciocompra;
			this.precioventa = precioventa;
		}
		public String getIddetalleingreso() {
			return iddetalleingreso;
		}
		public void setIddetalleingreso(String iddetalleingreso) {
			this.iddetalleingreso = iddetalleingreso;
		}
		public String getIdingreso() {
			return idingreso;
		}
		public void setIdingreso(String idingreso) {
			this.idingreso = idingreso;
		}
		public String getIdarticulo() {
			return idarticulo;
		}
		public void setIdarticulo(String idarticulo) {
			this.idarticulo = idarticulo;
		}
		public String getCantidad() {
			return cantidad;
		}
		public void setCantidad(String cantidad) {
			this.cantidad = cantidad;
		}
		public String getPreciocompra() {
			return preciocompra;
		}
		public void setPreciocompra(String preciocompra) {
			this.preciocompra = preciocompra;
		}
		public String getPrecioventa() {
			return precioventa;
		}
		public void setPrecioventa(String precioventa) {
			this.precioventa = precioventa;
		}
		
		
		
}
