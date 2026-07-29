package com.alfrecerrezuela.fastfood_manager;

import com.alfrecerrezuela.fastfood_manager.models.Usuario;
import com.alfrecerrezuela.fastfood_manager.repository.RepositorioUsuario;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FastfoodManagerApplication {

	public static void main(String[] args) {
		SpringApplication.run(FastfoodManagerApplication.class, args);
	}
	@Bean
	public CommandLineRunner init(RepositorioUsuario repositorioUsuario) {
		return args -> {
			Usuario usurio1 = new Usuario("Alfre","123","Alfredodcerrezuel@gmail.com", "1140334172", 2004,5,9);

			repositorioUsuario.save(usurio1);

		};
	}
}
