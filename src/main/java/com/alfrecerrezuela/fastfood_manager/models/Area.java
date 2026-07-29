package com.alfrecerrezuela.fastfood_manager.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Area {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String nombre;
	@NonNull
	private String descripcion;
	private Boolean activo;
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "sucursal_id")
	private Sucursal sucursal;

	public Area(@NonNull String nombre, @NonNull String descripcion, Boolean activo, Sucursal sucursal) {
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.activo = activo;
		this.sucursal = sucursal;
	}
	@JsonIgnore
	public Sucursal getSucursal() {
		return sucursal;
	}
}
