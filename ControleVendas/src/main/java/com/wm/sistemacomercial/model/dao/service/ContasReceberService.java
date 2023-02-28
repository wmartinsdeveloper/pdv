package com.wm.sistemacomercial.model.dao.service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.ContasReceberRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.ContasReceber;

@Service
public class ContasReceberService {
	
	@Autowired
	private ContasReceberRepository repository;
	
	public List<ContasReceber> findAll(){	
		return repository.findAll();
	}
	
	public ContasReceber findById(long id) {
		Optional<ContasReceber> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));
	}
	
	public List<ContasReceber> findByDataInclusao(Date data) {
		List<ContasReceber> obj = repository.findByDataInclusao(data);	
		return  obj;
	}	
		
	public List<ContasReceber> findByDataRecebeimento(Date data){
		List<ContasReceber> obj = repository.findByDataRecebimento(data);	
		return  obj;
	}		
	
	public List<ContasReceber> findByStatus(@Param("status") String status){
		List<ContasReceber> obj = repository.findByStatus(status);	
		return  obj;
	}
	
	public List<ContasReceber> findByDataInclusaoBetween( Date DataInicial, Date DataFim){
		List<ContasReceber> obj = repository.findByDataInclusaoBetween(DataInicial,DataFim);	
		return  obj;
	}	
	
	
}
