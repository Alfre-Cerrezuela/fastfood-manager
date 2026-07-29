package com.alfrecerrezuela.fastfood_manager.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;

@Entity
@Data
public class Usuario {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String name;
	private String password;
	@Email
	private String email;
	private String telefono;
	private Boolean activo= true;
	private LocalDate fechaNacimento;
	private LocalDate fechaAlta;


	public Usuario(String name, String password, String email, String telefono, int año, int mes, int dia) {
		this.name = name;
		this.password = password;
		this.email = email;
		this.telefono = telefono;
		this.fechaNacimento = LocalDate.of(año, mes, dia);
		this.fechaAlta =  LocalDate.now();
	}


}
