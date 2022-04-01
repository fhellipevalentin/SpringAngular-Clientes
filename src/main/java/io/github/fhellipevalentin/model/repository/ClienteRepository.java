package io.github.fhellipevalentin.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fhellipevalentin.model.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{
	
}
