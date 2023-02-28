package com.wm.pdv.model.dao.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.wm.pdv.model.entities.ContasReceber;

@Repository
public interface ContasReceberRepository extends JpaRepository<ContasReceber, Long> {

 	public List<ContasReceber> findByDataInclusao(@Param("DataInclusao") Date data);
	
	public List<ContasReceber> findByDataRecebimento(@Param("DataRecebimento") Date data);	
	
	public List<ContasReceber> findByStatus(@Param("Status") String status);
	
	public List<ContasReceber> findByDataInclusaoBetween(@Param("DataInclusao") Date data_inicial,@Param("DataInclusao") Date data_fim);

	
}
