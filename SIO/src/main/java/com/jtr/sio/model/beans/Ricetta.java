package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ricetta")
public class Ricetta {
	
	@Id
	private long num_ricetta;
	private String tipo;
	private String tipo_specializzato;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "ricetta")
	private Prenotazione prenotazione;
	
	public Ricetta() {
	}
	public Ricetta(long num_ricetta, String tipo, String tipo_specializzato) {
		this.num_ricetta = num_ricetta;
		this.tipo = tipo;
		this.tipo_specializzato = tipo_specializzato;
	}
	public long getNum_ricetta() {
		return num_ricetta;
	}
	public void setNum_ricetta(long num_ricetta) {
		this.num_ricetta = num_ricetta;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getTipo_specializzato() {
		return tipo_specializzato;
	}
	public void setTipo_specializzato(String tipo_specializzato) {
		this.tipo_specializzato = tipo_specializzato;
	}
	public Prenotazione getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(Prenotazione prenotazione) {
		this.prenotazione = prenotazione;
	}
	
	

}
