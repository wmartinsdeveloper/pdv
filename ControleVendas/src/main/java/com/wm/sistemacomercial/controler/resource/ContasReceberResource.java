package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.ContasReceberService;
import com.wm.sistemacomercial.model.entities.ContasReceber;

@RestController
@RequestMapping(value = "/contasreceber")
public class ContasReceberResource {

	@Autowired
	private ContasReceberService contasreceberservice;

	@GetMapping
	public ResponseEntity<List<ContasReceber>> findAll() {		
		List<ContasReceber> list = contasreceberservice.findAll();		
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<ContasReceber> findById(@PathVariable Long id) {
		ContasReceber obj = contasreceberservice.findById(id);
		return ResponseEntity.ok().body(obj);

	}
	
	
}
