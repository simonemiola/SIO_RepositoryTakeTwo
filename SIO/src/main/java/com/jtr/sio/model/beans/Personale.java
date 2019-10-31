package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="personale")
public class Personale {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String matricola;
	private String cf;
	
	public Personale() {
	}
	public Personale(String matricola, String cf) {
		this.matricola = matricola;
		this.cf = cf;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	
	
	

}
