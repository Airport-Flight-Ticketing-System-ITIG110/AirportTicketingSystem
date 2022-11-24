package org.itig110.AirportFLightTicketingSystem.repo;

import org.itig110.AirportFLightTicketingSystem.model.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepo extends JpaRepository<Ticket, Integer> {
}
