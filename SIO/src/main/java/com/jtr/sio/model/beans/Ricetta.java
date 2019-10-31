package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ricetta")
public class Ricetta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long num_ricetta;
	private String tipo;
	private String tipo_specializzato;
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

}
