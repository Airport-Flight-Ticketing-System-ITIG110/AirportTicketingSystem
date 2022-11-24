package org.itig110.AirportFLightTicketingSystem.service;

import org.itig110.AirportFLightTicketingSystem.repo.TicketRepo;
import org.springframework.stereotype.Component;
import org.itig110.AirportFLightTicketingSystem.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class TicketService {

	@Autowired
	private TicketRepo ticketRepo;


	public Ticket saveTicket(Ticket ticket){
		return ticketRepo.save(ticket);
	}

	public Ticket getTicketById(Integer id)
	{
		return ticketRepo.findById(id).get();
	}

	public void updateTicket(Ticket ticket)
	{
		ticketRepo.save(ticket);
	}

	public void deleteTicketById(Integer id)
	{
		ticketRepo.deleteById(id);
	}
}
