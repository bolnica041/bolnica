package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tvz.hr.model.Pregled;

@Repository
public interface PregledRepository extends JpaRepository<Pregled,Integer>{

}
  