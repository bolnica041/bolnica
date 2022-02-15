package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvz.hr.model.Dijagnoza;

@Repository
public interface DijanozaRepository extends JpaRepository<Dijagnoza,Integer>{

}
