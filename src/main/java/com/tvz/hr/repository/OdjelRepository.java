package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tvz.hr.model.Odjel;

@Repository
public interface OdjelRepository extends JpaRepository<Odjel,Integer>{

}
  