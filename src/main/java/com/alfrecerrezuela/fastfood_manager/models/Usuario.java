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
	@Email
	private String email;
	private String telefono;
	private Boolean activo= true;
	private int DNI;

	public Usuario(String name, String email, String telefono, int DNI) {
		this.name = name;
		this.email = email;
		this.telefono = telefono;
		this.DNI = DNI;
	}

	@Override
	public String toString() {
		return "Usuario{" +
				"id=" + id +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", telefono='" + telefono + '\'' +
				", activo=" + activo +
				", DNI=" + DNI +
				'}';
	}
}


