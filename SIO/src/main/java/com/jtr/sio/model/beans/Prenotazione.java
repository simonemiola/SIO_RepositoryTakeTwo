package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="prenotazione")
public class Prenotazione {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_prenotazione;
	private long id_paziente;
	private long num_ricetta;
	
	public long getId_prenotazione() {
		return id_prenotazione;
	}

	public void setId_prenotazione(long id_prenotazione) {
		this.id_prenotazione = id_prenotazione;
	}

	public long getId_paziente() {
		return id_paziente;
	}

	public void setId_paziente(long id_paziente) {
		this.id_paziente = id_paziente;
	}

	public long getNum_ricetta() {
		return num_ricetta;
	}

	public void setNum_ricetta(long num_ricetta) {
		this.num_ricetta = num_ricetta;
	}

	public Prenotazione() {
	}

	public Prenotazione (long id_paziente, long num_ricetta) {
		this.id_paziente = id_paziente;
		this.num_ricetta = num_ricetta;
	}

}
