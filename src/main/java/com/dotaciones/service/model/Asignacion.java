package com.dotaciones.service.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "asignaciones")
public class Asignacion {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "fecha")
	private Date fecha;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_dispositivo", updatable = false, nullable = false, unique = true)
	private Dispositivo dispositivo;

	public Asignacion(Date fecha, Dispositivo dispositivo) {
		super();
		this.fecha = fecha;
		this.dispositivo = dispositivo;
	}

	public Asignacion() {
		super();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Dispositivo getDispositivo() {
		return dispositivo;
	}

	public void setDispositivo(Dispositivo dispositivo) {
		this.dispositivo = dispositivo;
	}

}
