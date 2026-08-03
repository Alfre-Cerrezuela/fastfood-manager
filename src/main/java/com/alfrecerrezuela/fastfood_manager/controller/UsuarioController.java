package com.alfrecerrezuela.fastfood_manager.controller;

import com.alfrecerrezuela.fastfood_manager.models.Usuario;
import com.alfrecerrezuela.fastfood_manager.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {
		@Autowired
		private RepositorioUsuario repositorioUsuario;
		@GetMapping(path = "")
		public List<Usuario> devolverUsuarios(){
			return repositorioUsuario.findAll();
		}
	}
