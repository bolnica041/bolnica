package com.tvz.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="doktor")
public class Doktor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="ime")
	private String ime;
	
	@Column(name="prezime")
	private String prezime;
	
	@Column(name="telefon")
	private String telefon;
	
	@Column(name="odjelID")
	private Integer odjelID;
	
	public Doktor() {
		super();
	}

	public Doktor(Integer id, String ime, String prezime, String telefon, Integer odjelID) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.telefon = telefon;
		this.odjelID = odjelID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Integer getOdjelID() {
		return odjelID;
	}

	public void setOdjelID(Integer odjelID) {
		this.odjelID = odjelID;
	}
	
}
