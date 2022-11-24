package org.itig110.AirportFLightTicketingSystem.controller;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/admin")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight/{number}")
    public Flight getFlightByNumber(@PathVariable("number") Long number){
        return flightService.getFlightById(number);
    }

    @PutMapping("/flight/{number}")
    public Flight updateFlight(@PathVariable("number") Long number, @RequestBody Flight flight){
        flightService.updateFlight(flight);
        return flight;
    }

    @PostMapping("/flight")
    public Flight saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    @DeleteMapping("/flight/{number}")
    public String deleteFlight(@PathVariable("number") Long number){
        flightService.deleteFlight(number);
        return "{\"code\": 200, \"message\": \"Success\"}";
    }
}
