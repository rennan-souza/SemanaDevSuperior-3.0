package renan.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import renan.dsvendas.entities.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long> {

}
