package com.jtr.sio.controller;

import java.time.LocalDate;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.ExampleMatcher.GenericPropertyMatcher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jtr.sio.model.beans.Paziente;
import com.jtr.sio.model.beans.Persona;
import com.jtr.sio.model.beans.Prenotazione;
import com.jtr.sio.model.repositories.PazienteRepository;
import com.jtr.sio.model.repositories.PersonaRepository;
import com.jtr.sio.model.repositories.PrenotazioneRepository;

@Controller
public class ControllerBooking {
	
	@Autowired
	PrenotazioneRepository prenotazioneRepository;
	@Autowired
	PersonaRepository personaRepository;
	@Autowired
	PazienteRepository pazienteRepository;
	
	@RequestMapping(value="prenotaVisita", method=RequestMethod.POST)
	public String prenotaVisita(@RequestParam("nome") String name, @RequestParam(name="cognome") String surname, 
			@RequestParam(name="residenza") String address, @RequestParam(name="codiceFiscale") String cf, 
			/*@RequestParam("dataNascita") LocalDate dataNascita*/ @RequestParam(name="numeroRicetta") long numeroRicetta, 
			@RequestParam(name="tipoVisita") String tipoVisita, @RequestParam(name="esame") String esame) {
		
			
		return "index";
	}
}
