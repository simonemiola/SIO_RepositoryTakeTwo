package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="esame")
public class Esame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_esame;
	private String tipo;
	private long id_medico;
	public long getId_esame() {
		return id_esame;
	}
	public void setId_esame(long id_esame) {
		this.id_esame = id_esame;
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
	public Esame() {
	}
	public Esame(String tipo, long id_medico) {
		this.tipo = tipo;
		this.id_medico = id_medico;
	}
	
}
