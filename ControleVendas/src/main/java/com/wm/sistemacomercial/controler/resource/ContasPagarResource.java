package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.ContasPagarService;
import com.wm.sistemacomercial.model.entities.ContasPagar;

@RestController
@RequestMapping(value = "/contaspagar")
public class ContasPagarResource {

	@Autowired
	private ContasPagarService contaspagarservice;

	@GetMapping
	public ResponseEntity<List<ContasPagar>> findAll() {		
		List<ContasPagar> list = contaspagarservice.findAll();		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ContasPagar> findById(@PathVariable Long id) {
		ContasPagar obj = contaspagarservice.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	
}
