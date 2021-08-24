package com.dotaciones.service.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dotaciones.service.dto.AsignacionDTO;
import com.dotaciones.service.service.AsignacionService;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class AsignacionController {

	@Autowired
	AsignacionService asignacionService;

	@PostMapping("/asignaciones")
	public ResponseEntity<Object> create(@RequestBody AsignacionDTO asignacion) {
		try {
			asignacionService.save(asignacion);
			return new ResponseEntity<>(null, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
