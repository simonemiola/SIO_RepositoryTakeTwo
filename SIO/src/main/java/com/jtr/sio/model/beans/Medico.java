package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_medico;
	private String qualifica;
	private long id_reparto;
	private String matricola;
	
	public Medico(String qualifica, long id_reparto, String matricola) {
		this.qualifica = qualifica;
		this.id_reparto = id_reparto;
		this.matricola = matricola;
	}
	public Medico() {
	}
	public long getId_medico() {
		return id_medico;
	}
	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}
	public String getQualifica() {
		return qualifica;
	}
	public void setQualifica(String qualifica) {
		this.qualifica = qualifica;
	}
	public long getId_reparto() {
		return id_reparto;
	}
	public void setId_reparto(long id_reparto) {
		this.id_reparto = id_reparto;
	}
	public String getMatricola() {
		return matricola;
	}
	public void setMatricola(String matricola) {
		this.matricola = matricola;
	}

}
