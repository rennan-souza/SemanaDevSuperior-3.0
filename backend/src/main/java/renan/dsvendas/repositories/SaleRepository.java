package renan.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import renan.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long> {

}
