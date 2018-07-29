package com.mycompany.store.repository;

import com.mycompany.store.domain.Shipment;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;


/**
 * Spring Data  repository for the Shipment entity.
 */
@SuppressWarnings("unused")
@Repository
public interface ShipmentRepository extends JpaRepository<Shipment, Long> {

	Page<Shipment> findAllByCustomerUserLogin(String login, Pageable pageable);

	Optional<Shipment> findOneByIdAndCustomerUserLogin(Long id, String login);

}
