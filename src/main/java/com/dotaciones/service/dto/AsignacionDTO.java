package com.dotaciones.service.dto;

public class AsignacionDTO {

	private String serial;
	private String propietario;
	private String email;

	public AsignacionDTO(String serial, String propietario, String email) {
		super();
		this.serial = serial;
		this.propietario = propietario;
		this.email = email;
	}

	public AsignacionDTO() {
		super();
	}

	public String getSerial() {
		return serial;
	}

	public void setSerial(String serial) {
		this.serial = serial;
	}

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	};

}
