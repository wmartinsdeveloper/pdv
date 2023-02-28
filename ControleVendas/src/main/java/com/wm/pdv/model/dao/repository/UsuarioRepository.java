package com.wm.pdv.model.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.Conta;

@Repository
public interface UsuarioRepository extends JpaRepository<Conta, Long>{

}
