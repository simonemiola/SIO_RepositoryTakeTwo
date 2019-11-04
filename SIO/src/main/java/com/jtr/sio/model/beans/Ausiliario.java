package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ausiliario")
public class Ausiliario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_ausiliario;
	private String ruolo;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Personale personale;
	
	public Ausiliario() {
	}

	public Ausiliario(String ruolo, Personale personale) {
		super();
		this.ruolo = ruolo;
		this.personale = personale;
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

	public Personale getPersonale() {
		return personale;
	}

	public void setPersonale(Personale personale) {
		this.personale = personale;
	}
	
	

	

}
