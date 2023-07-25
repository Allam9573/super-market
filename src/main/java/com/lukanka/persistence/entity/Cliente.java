package com.lukanka.persistence.entity;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "CLIENTES")
@Getter
@Setter
public class Cliente {

	@Id
	@Column(name = "id")
	private Integer idCliente;
	private String nombre;
	@Column(name = "apellidos")
	private String apellido;
	private String celular;
	private String direccion;
	@Column(name = "correo_electronico")
	private String correoElectronico;
	
	//lista
	@OneToMany(mappedBy = "cliente")
	private List<Compra> listaCompras;




}
