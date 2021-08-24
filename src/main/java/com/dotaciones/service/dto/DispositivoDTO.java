package com.dotaciones.service.dto;

public class DispositivoDTO {

	private String nombre;
	private Long idTipo;

	public DispositivoDTO(String nombre, Long idTipo) {
		super();
		this.nombre = nombre;
		this.idTipo = idTipo;
	}

	public DispositivoDTO() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Long getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Long idTipo) {
		this.idTipo = idTipo;
	}

}
