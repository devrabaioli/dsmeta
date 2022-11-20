package dev.rabaioli.desmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import dev.rabaioli.desmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
