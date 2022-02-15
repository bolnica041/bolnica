package com.tvz.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="odjel")
public class Odjel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="naziv")
	private String naziv;
	
	@Column(name="telefon")
	private String telefon;
	
	@Column(name="bolnicaID")
	private Integer bolnicaID;
	
	public Odjel() {
		super();
	}
	
	public Odjel(Integer id, String naziv, String telefon, Integer bolnicaID) {
		super();
		this.id = id;
		this.naziv = naziv;
		this.telefon = telefon;
		this.bolnicaID = bolnicaID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	public Integer getBolnicaID() {
		return bolnicaID;
	}

	public void setBolnicaID(Integer bolnicaID) {
		this.bolnicaID = bolnicaID;
	}
	
}
