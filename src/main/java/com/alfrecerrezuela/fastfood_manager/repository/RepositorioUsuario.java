package com.alfrecerrezuela.fastfood_manager.repository;

import com.alfrecerrezuela.fastfood_manager.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;
import java.util.Optional;

@RepositoryRestResource()
public interface RepositorioUsuario extends JpaRepository<Usuario, Long> {
	Optional<Usuario> findByEmail(String email);
	List<Usuario> findByActiveTrue();
	boolean existsByEmail(String email);
}
