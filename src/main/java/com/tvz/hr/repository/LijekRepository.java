package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvz.hr.model.Lijek;

@Repository
public interface LijekRepository extends JpaRepository<Lijek,Integer>{

}
