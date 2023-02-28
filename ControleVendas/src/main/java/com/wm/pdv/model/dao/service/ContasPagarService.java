package com.wm.pdv.model.dao.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.wm.pdv.model.dao.repository.ContasPagarRepository;
import com.wm.pdv.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.pdv.model.entities.ContasPagar;

@Service
public class ContasPagarService {
	
	@Autowired
	private ContasPagarRepository repository;
	
	public List<ContasPagar> findAll(){	
		return repository.findAll();
	}
	
	public ContasPagar findById(long id) {
		Optional<ContasPagar> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	public List<ContasPagar> findByDataInclusao(Date data) {
		List<ContasPagar> obj = repository.findByDataInclusao(data);	
		return  obj;
	}	
		
	public List<ContasPagar> findByDataPagamento(Date data){
		List<ContasPagar> obj = repository.findByDataPagamento(data);	
		return  obj;
	}		
	
	public List<ContasPagar> findByStatus(@Param("status") String status){
		List<ContasPagar> obj = repository.findByStatus(status);	
		return  obj;
	}
	
	public List<ContasPagar> findByDataInclusaoBetween( Date DataInicial, Date DataFim){
		List<ContasPagar> obj = repository.findByDataInclusaoBetween(DataInicial,DataFim);	
		return  obj;
	}	
	
	
}
