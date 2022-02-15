package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvz.hr.model.Bolest;

@Repository
public interface BolestRepository extends JpaRepository<Bolest,Integer>{

}
  