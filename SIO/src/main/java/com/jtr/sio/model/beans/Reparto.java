package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="reparto")
public class Reparto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_reparto;
	private int num_posti;
	private String nome_reparto;
	private long id_caporeparto;
	
	public Reparto() {
	}
	public Reparto(int num_posti, String nome_reparto, long id_caporeparto) {
		this.num_posti = num_posti;
		this.nome_reparto = nome_reparto;
		this.id_caporeparto = id_caporeparto;
	}
	public long getId_reparto() {
		return id_reparto;
	}
	public void setId_reparto(long id_reparto) {
		this.id_reparto = id_reparto;
	}
	public int getNum_posti() {
		return num_posti;
	}
	public void setNum_posti(int num_posti) {
		this.num_posti = num_posti;
	}
	public String getNome_reparto() {
		return nome_reparto;
	}
	public void setNome_reparto(String nome_reparto) {
		this.nome_reparto = nome_reparto;
	}
	public long getId_caporeparto() {
		return id_caporeparto;
	}
	public void setId_caporeparto(long id_caporeparto) {
		this.id_caporeparto = id_caporeparto;
	}
	

}
