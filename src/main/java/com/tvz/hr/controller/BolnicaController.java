package com.tvz.hr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.tvz.hr.model.Bolnica;
import com.tvz.hr.repository.BolnicaRepository;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping("/bolnica")
public class BolnicaController {
	
	@Autowired
	private BolnicaRepository bolnicaRepository;
	
//	@GetMapping("")
//	public List<Bolnica> createHospital(){
//		return bolnicaRepository.findAll();
//	}
	
	@GetMapping("")
	public List<Bolnica> getAllHospitals(){
		return bolnicaRepository.findAll();
	}
	
//	@GetMapping("")
//	public List<Bolnica> updateHospitalById(){
//		return bolnicaRepository.findAll();
//	}
	
//	@GetMapping("")
//	public List<Bolnica> deleteHospitalById(){
//		return bolnicaRepository.findAll();
//	}

}
