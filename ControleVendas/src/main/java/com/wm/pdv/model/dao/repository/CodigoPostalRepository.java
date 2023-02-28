package com.wm.pdv.model.dao.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.CodigoPostal;

@Repository
public interface CodigoPostalRepository extends JpaRepository<CodigoPostal, String> {
	
	public Optional<CodigoPostal> findByCEP(String CEP);

}
