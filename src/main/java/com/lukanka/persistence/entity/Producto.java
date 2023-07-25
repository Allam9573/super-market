package com.lukanka.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "PRODUCTOS")
@Setter
@Getter

public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_producto")
	private Integer idProducto;
	private String nombre;
	@Column(name = "id_categoria")
	private Integer idCategoria;
	@Column(name = "codigo_barras")
	private String codigoBarras;
	@Column(name = "precio_venta")
	private double precioVenta;
	@Column(name = "cantidad_stock")
	private int stock;
	private boolean estado;
	@ManyToOne
	@JoinColumn(name = "id_categoria", insertable = false, updatable = false)
	private Categoria categoria;

}
