package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paziente")
public class Paziente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_paziente;
	private String cf;
	
	public Paziente() {
	}
	public Paziente(String cf) {
		this.cf = cf;
	}
	public long getId_paziente() {
		return id_paziente;
	}
	public void setId_paziente(long id_paziente) {
		this.id_paziente = id_paziente;
	}
	public String getCf() {
		return cf;
	}
	public void setCf(String cf) {
		this.cf = cf;
	}
	
	

}
