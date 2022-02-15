package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.tvz.hr.model.Osiguravatelj;

@Repository
public interface OsiguravateljRepository extends JpaRepository<Osiguravatelj,Integer>{

}
  