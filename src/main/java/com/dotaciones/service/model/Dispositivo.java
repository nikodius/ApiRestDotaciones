package com.dotaciones.service.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "dispositivos")
public class Dispositivo {

	@Id
	private String serial;

	@Column(name = "nombre")
	private String nombre;
	
	@Column(name = "so")
	private String so;

	@OneToOne(mappedBy = "dispositivo", cascade = CascadeType.ALL)
	private Asignacion asignacion;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_tipo")
	private TipoDispositivo tipoDispositivo;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_propietario")
	private Propietario propietario;

	public Dispositivo(String serial, String nombre, TipoDispositivo tipoDispositivo,
			Propietario propietario) {
		super();
		this.serial = serial;
		this.nombre = nombre;
		this.tipoDispositivo = tipoDispositivo;
		this.propietario = propietario;
	}

	public Dispositivo() {
		super();
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asignacion getAsignacion() {
		return asignacion;
	}

	public void setAsignacion(Asignacion asignacion) {
		this.asignacion = asignacion;
	}

	public TipoDispositivo getTipoDispositivo() {
		return tipoDispositivo;
	}

	public void setTipoDispositivo(TipoDispositivo tipoDispositivo) {
		this.tipoDispositivo = tipoDispositivo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

}
