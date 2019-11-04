package com.jtr.sio.model.beans;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="reparto")
public class Reparto {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_reparto;
	private int num_posti;
	private String nome_reparto;
	
	
	@OneToOne(fetch = FetchType.LAZY)
	private CapoReparto capoReparto;
	
	@OneToMany(fetch = FetchType.LAZY)
	private List<Medico> listMedico;
	
	public Reparto() {
	}
	
	
	public Reparto(int num_posti, String nome_reparto, CapoReparto capoReparto) {
		super();
		this.num_posti = num_posti;
		this.nome_reparto = nome_reparto;
		this.capoReparto = capoReparto;
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


	public CapoReparto getCapoReparto() {
		return capoReparto;
	}


	public void setCapoReparto(CapoReparto capoReparto) {
		this.capoReparto = capoReparto;
	}

	public List<Medico> getListMedico() {
		return listMedico;
	}

	public void setListMedico(List<Medico> listMedico) {
		this.listMedico = listMedico;
	}
	
	public void addMedico(Medico medico) {
		this.listMedico.add(medico);
	}
	
	
	
	

}
