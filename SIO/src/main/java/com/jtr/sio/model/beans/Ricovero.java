package com.jtr.sio.model.beans;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ricovero")
public class Ricovero {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id_ricovero;
	private LocalDate data_ricovero;
	private LocalDate data_dimissione;
	private String malattia;
	private String tipo_cura;
	private long id_medico;
	public long getId_ricovero() {
		return id_ricovero;
	}
	public void setId_ricovero(long id_ricovero) {
		this.id_ricovero = id_ricovero;
	}
	public LocalDate getData_ricovero() {
		return data_ricovero;
	}
	public void setData_ricovero(LocalDate data_ricovero) {
		this.data_ricovero = data_ricovero;
	}
	public LocalDate getData_dimissione() {
		return data_dimissione;
	}
	public void setData_dimissione(LocalDate data_dimissione) {
		this.data_dimissione = data_dimissione;
	}
	public String getMalattia() {
		return malattia;
	}
	public void setMalattia(String malattia) {
		this.malattia = malattia;
	}
	public String getTipo_cura() {
		return tipo_cura;
	}
	public void setTipo_cura(String tipo_cura) {
		this.tipo_cura = tipo_cura;
	}
	public long getId_medico() {
		return id_medico;
	}
	public void setId_medico(long id_medico) {
		this.id_medico = id_medico;
	}
	public Ricovero(LocalDate data_ricovero, LocalDate data_dimissione, String malattia, String tipo_cura,
			long id_medico) {
		this.data_ricovero = data_ricovero;
		this.data_dimissione = data_dimissione;
		this.malattia = malattia;
		this.tipo_cura = tipo_cura;
		this.id_medico = id_medico;
	}
	public Ricovero() {
	}
	

}
