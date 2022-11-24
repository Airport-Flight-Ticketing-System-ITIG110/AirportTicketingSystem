package org.itig110.AirportFLightTicketingSystem.controller;

import org.itig110.AirportFLightTicketingSystem.model.Ticket;
import org.itig110.AirportFLightTicketingSystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/admin")
public class TicketController {

	@Autowired
	private TicketService ticketService;

	@GetMapping("/ticket/{number}")
	public Ticket getTicketById(@PathVariable("number") Integer number){
		return ticketService.getTicketById(number);
	}

	@PutMapping("/ticket/{number}")
	public Ticket updateTicket(@PathVariable("number") Integer number, @RequestBody Ticket ticket){
		ticketService.updateTicket(ticket);
		return ticket;
	}

	@PostMapping("/ticket")
	public Ticket saveTicket(@RequestBody Ticket ticket){
		return ticketService.saveTicket(ticket);
	}

	@DeleteMapping("/ticket/{number}")
	public String deleteTicket(@PathVariable("number") Integer number){
		ticketService.deleteTicketById(number);
		return "{\"code\": 200, \"message\": \"Success\"}";
	}

}
