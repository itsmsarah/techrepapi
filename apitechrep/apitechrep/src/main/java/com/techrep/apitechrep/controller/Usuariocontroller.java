package com.techrep.apitechrep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.techrep.apitechrep.repository.Usuariorepository;

@RestController
@RequestMapping("api/cadastro")

public class Usuariocontroller {
	
	
	/*@GetMapping
	public String mensagem() {
		return "Olá Mundo";
	} */
	
	@Autowired
	
	private Usuariorepository cadastroRepository;
	
	/* classe primeira letra maiuscula e objeto primeira letra minúscula       */
}
