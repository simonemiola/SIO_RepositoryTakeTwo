package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="visita")
public class Visita {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_visita;
	private String tipo;

	@ManyToOne(fetch = FetchType.LAZY)
	private Medico medico;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Prenotazione prenotazione;
	
	public Visita() {
		super();
	}

	public Visita(String tipo, Medico medico) {
		super();
		this.tipo = tipo;
		this.medico = medico;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
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

	
	
	

}
