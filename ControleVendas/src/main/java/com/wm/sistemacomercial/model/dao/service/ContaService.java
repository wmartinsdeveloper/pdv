package com.wm.sistemacomercial.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.sistemacomercial.model.dao.repository.ContaRepository;
import com.wm.sistemacomercial.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.sistemacomercial.model.entities.Conta;

@Service
public class ContaService {
	
	@Autowired
	private ContaRepository repository;
	
	public List<Conta> findAll(){		
		return repository.findAll();
	}
	
	public Conta findById(long id) {
		Optional<Conta> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));	
	}
	
	public List<Conta> findByNomeContaining(String nome) {
		List<Conta> obj = repository.findByNomeContaining(nome);	
		return  obj;
	}
	
}
