package com.lukanka.persistence.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CATEGORIAS")
public class Categoria {
	@Id
	@Column(name = "id_categoria")
	private Integer idCategoria;

}
