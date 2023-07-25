package com.lukanka.persistence.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "COMPRAS")
@Setter
@Getter
public class Compra {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_compra")
	private Integer idCompra;
	@Column(name = "id_cliente")
	private Integer idCliente;
	@Column(name = "fecha_pago")
	private LocalDateTime fechaPago;
	@Column(name = "medio_pago")
	private String medioPago;
	private String comentario;
	private String estado;

	@OneToMany(mappedBy = "compra")
	private List<ComprasProducto> productos;

	@ManyToOne
	@JoinColumn(name = "id_cliente", insertable = false, updatable = false)
	private Cliente cliente;

}
