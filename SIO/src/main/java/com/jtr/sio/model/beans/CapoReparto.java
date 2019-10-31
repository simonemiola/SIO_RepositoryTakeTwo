package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="caporeparto")
public class CapoReparto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_caporeparto;
	private long id_medico;
	
	public CapoReparto() {
	}
	public CapoReparto(long id_medico) {
		this.id_medico = id_medico;
	}
	public long getId_caporeparto() {
		return id_caporeparto;
	}
	public void setId_caporeparto(long id_caporeparto) {
		this.id_caporeparto = id_caporeparto;
	}
	public long getId_medico() {
		return id_medico;
	}
	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}
	

}
