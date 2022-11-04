package org.itig110.AirportFLightTicketingSystem.repo;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepo extends JpaRepository<Flight, Long> {
}
