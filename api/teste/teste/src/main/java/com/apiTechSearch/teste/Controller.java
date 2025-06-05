package com.apiTechSearch.teste;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class Controller {

	@Autowired
	RepositoryPerfil repoPerfil;

	@GetMapping ("/perfil")
	public ResponseEntity<?> mostrarUsuario(){		
		return ResponseEntity.ok(repoPerfil.findAll());
	}
	
	//@Autowired
	//RepositoryPerfil repo; 
	// trocar nome do repositorio

	//@GetMapping ("/perfil")
	//trocar o controller ou seja trocar esse /
	//public ResponseEntity<?> mostrarUsuario(){		
	//	return ResponseEntity.ok(repo.findAll());
	//}

}

