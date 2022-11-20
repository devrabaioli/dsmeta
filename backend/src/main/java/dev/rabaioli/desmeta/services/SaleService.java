package dev.rabaioli.desmeta.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dev.rabaioli.desmeta.entities.Sale;
import dev.rabaioli.desmeta.repositories.SaleRepository;

@Service
public class SaleService {
	
	@Autowired
	private SaleRepository repo;
	
	public List<Sale> findSales() {
		return repo.findAll();
		
		
	}

}
