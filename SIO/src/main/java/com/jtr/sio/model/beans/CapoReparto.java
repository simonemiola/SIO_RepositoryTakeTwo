package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="caporeparto")
public class CapoReparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_caporeparto;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Medico medico;
	
	public CapoReparto() {
	}

	public CapoReparto(Medico medico) {
		super();
		this.medico = medico;
	}

	public long getId_caporeparto() {
		return id_caporeparto;
	}
	public void setId_caporeparto(long id_caporeparto) {
		this.id_caporeparto = id_caporeparto;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	
	

}
