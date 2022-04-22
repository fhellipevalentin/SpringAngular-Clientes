package io.github.fhellipevalentin.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.github.fhellipevalentin.model.entities.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	
}
