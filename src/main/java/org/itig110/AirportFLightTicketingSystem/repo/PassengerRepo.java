package org.itig110.AirportFLightTicketingSystem.repo;

import org.itig110.AirportFLightTicketingSystem.model.Passenger;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PassengerRepo extends JpaRepository<Passenger, Integer> {
}
