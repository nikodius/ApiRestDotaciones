package com.dotaciones.service.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dotaciones.service.dto.AsignacionDTO;
import com.dotaciones.service.dto.DispositivoDTO;
import com.dotaciones.service.exception.LogicException;
import com.dotaciones.service.model.Asignacion;
import com.dotaciones.service.model.Dispositivo;
import com.dotaciones.service.model.Propietario;
import com.dotaciones.service.model.TipoDispositivo;
import com.dotaciones.service.repository.AsignacionRepository;
import com.dotaciones.service.repository.TipoDispositivoRepository;

@Service
public class AsignacionService {

	@Autowired
	private AsignacionRepository asignacionRepository;
	
	@Autowired
	private TipoDispositivoRepository tipoDispositivoRepository;
	
	@Autowired
	private MockService mockService;

	public void save(AsignacionDTO asignacionDto) throws LogicException {
		//llamar mock service
		DispositivoDTO dispositivoExistente = mockService.consultarDispositivo(asignacionDto.getSerial());
		
		if(dispositivoExistente==null) {
			throw new LogicException("El dispositivo no existe");
		}
		
		Asignacion asignacionPrevia = asignacionRepository.findBySerial(asignacionDto.getSerial());
		if(asignacionPrevia!=null) {
			throw new LogicException("El dispositivo ya se encuentra asignado");
		}
		
		//asignacion dispositivo
		TipoDispositivo tipoDispositivo = tipoDispositivoRepository.findById(dispositivoExistente.getIdTipo()).orElse(null);
		Propietario propietario = new Propietario(asignacionDto.getPropietario(), asignacionDto.getEmail());
		Dispositivo dispositivo = new Dispositivo(asignacionDto.getSerial(), dispositivoExistente.getNombre(), tipoDispositivo, propietario);
		Asignacion asignacion = new Asignacion(new Date(), dispositivo);
		asignacionRepository.save(asignacion);
	}
	

}
