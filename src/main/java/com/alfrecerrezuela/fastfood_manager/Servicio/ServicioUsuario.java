package com.alfrecerrezuela.fastfood_manager.Servicio;

import com.alfrecerrezuela.fastfood_manager.models.Usuario;
import com.alfrecerrezuela.fastfood_manager.repository.RepositorioUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServicioUsuario {
	@Autowired
	RepositorioUsuario repositorioUsuario;

	public List<Usuario> listarUsuariosActivos(){
		return repositorioUsuario.findByActiveTrue();
	}
	public Optional<Usuario> encontrarPorMail(String email){
		return repositorioUsuario.findByEmail(email);
	}
	public Usuario encontrarPorId(Long id){
		return repositorioUsuario.findById(id).get();
	}
	public void guardarUsuario(Usuario usuario){
		repositorioUsuario.save(usuario);
	}
	public void desactivarUsuario(Long id){
		Usuario usuario = repositorioUsuario.findById(id).get();
		usuario.setActivo(false);
		repositorioUsuario.save(usuario);
	}

}
