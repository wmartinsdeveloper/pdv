package com.wm.sistemacomercial.controler.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wm.sistemacomercial.model.dao.service.ContaService;
import com.wm.sistemacomercial.model.entities.Conta;

@RestController
@RequestMapping(value = "/conta")
public class ContaResource {

	@Autowired
	private ContaService conta;

	@GetMapping
	public ResponseEntity<List<Conta>> findAll() {
		List<Conta> list = conta.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Conta> findById(@PathVariable Long id) {
		Conta obj =conta.findById(id);
		return ResponseEntity.ok().body(obj);

	}

	@GetMapping(value = "/nome/{nome}")
	public ResponseEntity<List<Conta>> findByNome(@PathVariable String nome) {
		List<Conta> obj = conta.findByNomeContaining(nome);
		return ResponseEntity.ok().body(obj);
	}


}
