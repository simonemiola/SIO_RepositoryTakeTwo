package com.jtr.sio.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jtr.sio.controller.Persona;

public interface PersonaRepository extends JpaRepository<Persona, String> {

}
