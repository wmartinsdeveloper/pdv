package com.wm.pdv.model.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.ContasPagar;

@Repository
public interface ContasPagarRepository extends JpaRepository<ContasPagar, Long> {
	
	
 	public List<ContasPagar> findByDataInclusao(@Param("dataInclusao") Date data);
	
	public List<ContasPagar> findByDataPagamento(@Param("dataPagamento") Date data);	
	
	public List<ContasPagar> findByStatus(@Param("status") String status);
	
	public List<ContasPagar> findByDataInclusaoBetween(@Param("dataInclusao") Date data_inicial,@Param("dataInclusao") Date data_fim);


}
