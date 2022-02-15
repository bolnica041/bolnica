package com.tvz.hr.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pregled")
public class Pregled {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="termin")
	private LocalDate termin;
	
	@Column(name="doktorID")
	private Integer doktorID;
	
	@Column(name="pacijentID")
	private Integer pacijentID;
	
	public Pregled() {
		super();
	}
	
	public Pregled(Integer id, LocalDate termin, Integer doktorID, Integer pacijentID) {
		super();
		this.id = id;
		this.termin = termin;
		this.doktorID = doktorID;
		this.pacijentID = pacijentID;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getTermin() {
		return termin;
	}

	public void setTermin(LocalDate termin) {
		this.termin = termin;
	}

	public Integer getDoktorID() {
		return doktorID;
	}

	public void setDoktorID(Integer doktorID) {
		this.doktorID = doktorID;
	}

	public Integer getPacijentID() {
		return pacijentID;
	}

	public void setPacijentID(Integer pacijentID) {
		this.pacijentID = pacijentID;
	}
	
}
