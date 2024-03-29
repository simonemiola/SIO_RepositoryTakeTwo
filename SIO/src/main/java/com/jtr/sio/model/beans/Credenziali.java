package com.jtr.sio.model.beans;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="credenziali")
public class Credenziali {
	
	@Id
	private String username;
	private String password;
	
	@OneToOne(fetch = FetchType.LAZY)
	private Personale personale;
	
	
	public Credenziali() {
	}

	
	public Credenziali(String username, String password, Personale personale) {
		super();
		this.username = username;
		this.password = password;
		this.personale = personale;
	}


	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public Personale getPersonale() {
		return personale;
	}


	public void setPersonale(Personale personale) {
		this.personale = personale;
	}
	
	
	
	

}
