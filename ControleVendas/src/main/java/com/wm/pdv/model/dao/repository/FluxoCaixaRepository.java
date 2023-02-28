package com.wm.pdv.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.FluxoCaixa;

@Repository
public interface FluxoCaixaRepository extends JpaRepository<FluxoCaixa, Long> {

}
