package com.wm.pdv.model.dao.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
	
	@Query(value = "SELECT u FROM Conta u where upper(u.Nome) like concat('%',upper(:Nome),'%')")
	public List<Conta> findByNomeContaining(@Param("Nome") String Nome);

}
