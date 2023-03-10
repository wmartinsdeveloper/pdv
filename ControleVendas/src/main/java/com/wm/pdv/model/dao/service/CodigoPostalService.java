package com.wm.pdv.model.dao.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.pdv.model.dao.repository.CodigoPostalRepository;
import com.wm.pdv.model.dao.service.exception.ResourceNotFoundExcepetion;
import com.wm.pdv.model.entities.CodigoPostal;

@Service
public class CodigoPostalService {

	@Autowired
	private CodigoPostalRepository repository;
		
	public List<CodigoPostal> findAll(){		
		return repository.findAll();
	}
			
	public CodigoPostal findByCep(String Cep) {
		Optional<CodigoPostal> obj = repository.findByCEP(Cep);
		return obj.orElseThrow(() -> new ResourceNotFoundExcepetion(Cep));	
	}
	
	
	
	
	
}
