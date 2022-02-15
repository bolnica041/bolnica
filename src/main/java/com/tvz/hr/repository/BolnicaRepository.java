package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tvz.hr.model.Bolnica;

@Repository
public interface BolnicaRepository extends JpaRepository<Bolnica,Integer>{

}
