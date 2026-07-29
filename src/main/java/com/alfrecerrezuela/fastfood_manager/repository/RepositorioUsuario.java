package com.alfrecerrezuela.fastfood_manager.repository;

import com.alfrecerrezuela.fastfood_manager.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource()
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	private Usuario findByEmail(String email) {
		return null;
	}
}
