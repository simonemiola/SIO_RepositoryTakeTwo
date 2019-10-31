package com.jtr.sio.model.repositories;

import java.util.List;
import com.jtr.sio.model.beans.*;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PazienteRepository extends JpaRepository<Paziente, Long> {
	
}
