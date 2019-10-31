package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ausiliario")
public class Ausiliario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_ausiliario;
	private String ruolo;
	private String matricola;
	
	public Ausiliario() {
	}
	public Ausiliario(String ruolo, String matricola) {
		this.ruolo = ruolo;
		this.matricola = matricola;
	}
	public long getId_ausiliario() {
		return id_ausiliario;
	}
	public void setId_ausiliario(long id_ausiliario) {
		this.id_ausiliario = id_ausiliario;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	

}
