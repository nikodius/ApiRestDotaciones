package com.dotaciones.service.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "tipos_dispositivos")
public class TipoDispositivo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "tipo")
	private String tipo;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "tipoDispositivo")
	private List<Dispositivo> dispositivos;

	public TipoDispositivo() {
		super();
	}

	public TipoDispositivo(long id, String tipo, List<Dispositivo> dispositivos) {
		super();
		this.id = id;
		this.tipo = tipo;
		this.dispositivos = dispositivos;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Dispositivo> getDispositivos() {
		return dispositivos;
	}

	public void setDispositivos(List<Dispositivo> dispositivos) {
		this.dispositivos = dispositivos;
	}

}
