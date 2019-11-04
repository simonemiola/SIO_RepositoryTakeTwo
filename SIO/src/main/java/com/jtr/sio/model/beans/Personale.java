package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="personale")
public class Personale {
	
	@Id
	private String matricola;


	@OneToOne(fetch = FetchType.LAZY)
	private Persona persona;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personale")
	private Medico medico;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personale")
	private Ausiliario ausiliario;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "personale")
	private Credenziali credenziali;
	
	public Personale() {
	}
	
	
	public Personale(String matricola, Persona persona) {
		super();
		this.matricola = matricola;
		this.persona = persona;
	}

	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}


	public Persona getPersona() {
		return persona;
	}


	public void setPersona(Persona persona) {
		this.persona = persona;
	}


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}


	public Ausiliario getAusiliario() {
		return ausiliario;
	}


	public void setAusiliario(Ausiliario ausiliario) {
		this.ausiliario = ausiliario;
	}

	
	
	
	

}
