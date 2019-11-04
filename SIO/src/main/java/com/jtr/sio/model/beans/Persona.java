package com.jtr.sio.model.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="persona")
public class Persona {
	
	@Id
	private String cf;
	private String nome;
	private String cognome;
	private String residenza;
	private LocalDate data_nascita;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	private Personale personale;
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "persona")
	private Paziente paziente;
	
	public Persona() {
	}
	public Persona(String cf, String nome, String cognome, String residenza, LocalDate data_nascita) {
		this.cf = cf;
		this.nome = nome;
		this.cognome = cognome;
		this.residenza = residenza;
		this.data_nascita = data_nascita;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getResidenza() {
		return residenza;
	}
	public void setResidenza(String residenza) {
		this.residenza = residenza;
	}
	public LocalDate getData_nascita() {
		return data_nascita;
	}
	public void setData_nascita(LocalDate data_nascita) {
		this.data_nascita = data_nascita;
	}
	public Personale getPersonale() {
		return personale;
	}
	public void setPersonale(Personale personale) {
		this.personale = personale;
	}
	public Paziente getPaziente() {
		return paziente;
	}
	public void setPaziente(Paziente paziente) {
		this.paziente = paziente;
	}
	
	
}
