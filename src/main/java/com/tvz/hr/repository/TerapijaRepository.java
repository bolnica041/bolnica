package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tvz.hr.model.Terapija;

@Repository
public interface TerapijaRepository extends JpaRepository<Terapija,Integer>{

}
  