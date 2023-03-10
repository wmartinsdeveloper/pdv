package com.wm.pdv.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.pdv.model.dao.repository.TelefoneRepository;
import com.wm.pdv.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.pdv.model.entities.Endereco;
import com.wm.pdv.model.entities.Telefone;

@Service
public class TelefoneService {
	
	@Autowired
	private TelefoneRepository repository;
	
	public List<Telefone> findAll(){		
		return repository.findAll();
	}
	
	public Telefone findById(long id) {
		Optional<Telefone> obj = repository.findById(id);		
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(id));	
	}
	
	
	
}
