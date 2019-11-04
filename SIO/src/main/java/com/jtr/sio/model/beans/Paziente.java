package com.jtr.sio.model.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="paziente")
public class Paziente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_paziente;

	@OneToOne(fetch = FetchType.LAZY)
	private Persona persona;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "paziente")
	private List<Prenotazione> prenotazioni;
	
	public Paziente() {
	}

	public Paziente(Persona persona) {
		super();
		this.persona = persona;
	}

	public long getId_paziente() {
		return id_paziente;
	}
	public void setId_paziente(long id_paziente) {
		this.id_paziente = id_paziente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public List<Prenotazione> getPrenotazioni() {
		return prenotazioni;
	}

	public void setPrenotazioni(List<Prenotazione> prenotazioni) {
		this.prenotazioni = prenotazioni;
	}
	
	

	
	

}
