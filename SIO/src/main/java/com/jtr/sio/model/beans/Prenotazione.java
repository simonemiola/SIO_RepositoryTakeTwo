package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="prenotazione")
public class Prenotazione {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_prenotazione;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Paziente paziente;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Ricetta ricetta;
	
	
	public Prenotazione(Paziente paziente, Ricetta ricetta) {
		super();
		this.paziente = paziente;
		this.ricetta = ricetta;
	}

	public long getId_prenotazione() {
		return id_prenotazione;
	}

	public void setId_prenotazione(long id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public Paziente getPaziente() {
		return paziente;
	}

	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}

	public Ricetta getRicetta() {
		return ricetta;
	}

	public void setRicetta(Ricetta ricetta) {
		this.ricetta = ricetta;
	}

	

}
