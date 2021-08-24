package com.dotaciones.service.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.dotaciones.service.model.Asignacion;

@Repository
public interface AsignacionRepository extends CrudRepository<Asignacion, Long> {

	@Query(value="Select a from Asignacion a where a.dispositivo.serial = :serial")
	public Asignacion findBySerial(@Param("serial") String serial);
}
