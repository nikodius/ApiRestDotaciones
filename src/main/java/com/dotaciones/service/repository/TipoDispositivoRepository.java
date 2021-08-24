package com.dotaciones.service.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.dotaciones.service.model.TipoDispositivo;

@Repository
public interface TipoDispositivoRepository extends CrudRepository<TipoDispositivo, Long>{

}
