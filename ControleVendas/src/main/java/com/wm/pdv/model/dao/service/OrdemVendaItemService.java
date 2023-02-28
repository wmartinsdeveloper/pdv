package com.wm.pdv.model.dao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wm.pdv.model.dao.repository.OrdemVendaItemRepository;
import com.wm.pdv.model.entities.OrdemVendaItem;

@Service
public class OrdemVendaItemService {

	@Autowired
	private OrdemVendaItemRepository repository;

	public List<OrdemVendaItem> findAll() {
		return repository.findAll();
	}

	public OrdemVendaItem findByOrdemVenda(String id) {
		OrdemVendaItem obj = repository.findByOrdemVenda(id);
		return obj;
	}

		
}
