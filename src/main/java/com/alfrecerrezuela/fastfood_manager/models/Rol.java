package com.alfrecerrezuela.fastfood_manager.models;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	private String nombre;
	private String descripcion;
}
