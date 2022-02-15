package com.tvz.hr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.tvz.hr.model.Doktor;

@Repository
public interface DoktorRepository extends JpaRepository<Doktor, Integer> {

}
