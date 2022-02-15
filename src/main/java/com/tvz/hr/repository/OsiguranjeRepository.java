package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tvz.hr.model.Osiguranje;

@Repository
public interface OsiguranjeRepository extends JpaRepository<Osiguranje,Integer>{

}
  