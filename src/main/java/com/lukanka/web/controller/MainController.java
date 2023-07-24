package com.lukanka.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class MainController {

	@GetMapping("/list")
	public String main() {
		return "Listar productos";
	}

	@GetMapping("/agregar")
	public String nuevo() {
		return "Agregar producto";
	}

	@GetMapping("/id")
	public String ver() {
		return "Ver producto ID";
	}
}