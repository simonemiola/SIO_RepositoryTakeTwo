package com.jtr.sio.model.repositories;

import java.util.Optional;
import com.jtr.sio.model.beans.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona, String> {

}
