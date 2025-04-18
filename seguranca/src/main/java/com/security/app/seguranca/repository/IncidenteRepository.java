package com.security.app.seguranca.repository;

import com.security.app.seguranca.model.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository<Incidente, Long> {

}
