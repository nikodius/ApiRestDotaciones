package com.dotaciones.service.service;

import org.springframework.stereotype.Service;

import com.dotaciones.service.dto.DispositivoDTO;

@Service
public class MockService {

	public DispositivoDTO consultarDispositivo(String serial) {
		DispositivoDTO dispositivo = new DispositivoDTO("pc portatil",Long.valueOf(2));
		return dispositivo;
	}
}
