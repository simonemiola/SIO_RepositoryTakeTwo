package com.jtr.sio.model.beans;

import javax.persistence.*;

import com.jtr.sio.model.beans.*;

@Entity
@Table(name="fornitore")
public class Fornitore {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id_fornitore;
	private String nome;
	private String esercizio;
	private String p_iva;
	public long getId_fornitore() {
		return id_fornitore;
	}
	public void setId_fornitore(long id_fornitore) {
		this.id_fornitore = id_fornitore;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEsercizio() {
		return esercizio;
	}
	public void setEsercizio(String esercizio) {
		this.esercizio = esercizio;
	}
	public String getP_iva() {
		return p_iva;
	}
	public void setP_iva(String p_iva) {
		this.p_iva = p_iva;
	}
	public Fornitore(String nome, String esercizio, String p_iva) {
		this.nome = nome;
		this.esercizio = esercizio;
		this.p_iva = p_iva;
	}
	public Fornitore() {
	}
	
	

}
