package com.jtr.sio.model.beans;

import java.util.List;

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
@Table(name="medico")
public class Medico {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_medico;
	private String qualifica;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Reparto reparto;
	
	@OneToOne(fetch = FetchType.LAZY, mappedBy = "medico")
	private CapoReparto capoReparto;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medico")
	private List<Esame> esame;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Personale personale;
	
	
	public Medico() {
	}
	
	public Medico(String qualifica, Reparto reparto, Personale personale) {
		super();
		this.qualifica = qualifica;
		this.reparto = reparto;
		this.personale = personale;
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

	public Personale getPersonale() {
		return personale;
	}
	public void setPersonale(Personale personale) {
		this.personale = personale;
	}


	public CapoReparto getCapoReparto() {
		return capoReparto;
	}


	public void setCapoReparto(CapoReparto capoReparto) {
		this.capoReparto = capoReparto;
	}

	public Reparto getReparto() {
		return reparto;
	}

	public void setReparto(Reparto reparto) {
		this.reparto = reparto;
	}

	public List<Esame> getEsame() {
		return esame;
	}

	public void setEsame(List<Esame> esame) {
		this.esame = esame;
	}

	
	
	

}
