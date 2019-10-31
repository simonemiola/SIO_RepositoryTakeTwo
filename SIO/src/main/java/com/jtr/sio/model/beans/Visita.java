package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="visita")
public class Visita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_visita;
	private String tipo;
	private long id_medico;
	public long getId_visita() {
		return id_visita;
	}
	public void setId_visita(long id_visita) {
		this.id_visita = id_visita;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public long getId_medico() {
		return id_medico;
	}
	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}
	public Visita(String tipo, long id_medico) {
		this.tipo = tipo;
		this.id_medico = id_medico;
	}
	public Visita() {
	}
	
	
	

}
