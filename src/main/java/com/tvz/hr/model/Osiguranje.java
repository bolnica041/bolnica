package com.tvz.hr.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="osiguranje")
public class Osiguranje {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
//	[pacijentID] [int] NOT NULL,
//	[osiguravateljID] [int] NOT NULL,

}
