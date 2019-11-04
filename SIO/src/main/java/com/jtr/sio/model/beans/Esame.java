package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="esame")
public class Esame {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_esame;
	private String tipo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Medico medico;
	
	
	public Esame() {
		super();
	}
	
	
	public Esame(String tipo, Medico medico) {
		super();
		this.tipo = tipo;
		this.medico = medico;
	}
	
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


	public Medico getMedico() {
		return medico;
	}


	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	
	
	
}
