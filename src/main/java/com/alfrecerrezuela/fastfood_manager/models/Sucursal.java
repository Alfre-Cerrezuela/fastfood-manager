package com.alfrecerrezuela.fastfood_manager.models;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import java.util.Set;

@Entity
@Data
public class Sucursal {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private String direccion;
	private Boolean activo;
	@OneToMany(mappedBy = "sucursal",fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Set<Area> areas;

	public Sucursal(String nombre, String direccion, Boolean activo, Set<Area> areas) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.activo = activo;
		this.areas = areas;
	}
}
