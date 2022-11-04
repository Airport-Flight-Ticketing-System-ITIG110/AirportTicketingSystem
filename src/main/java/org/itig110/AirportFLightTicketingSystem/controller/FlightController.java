package org.itig110.AirportFLightTicketingSystem.controller;


import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/admin")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/flight/{number}")
    public Flight getFlightByNumber(@PathVariable("number") Integer number){
        return new Flight();
    }

    @PutMapping("/flight/{number}")
    public Flight updateFlight(@PathVariable("number") Integer number, @RequestBody Flight flight){
        return new Flight();
    }

    @PostMapping
    public Flight saveFlight(@RequestBody Flight flight){
        return flightService.saveFlight(flight);
    }

    @DeleteMapping("/flight/{number}")
    public Boolean deleteFlight(@PathVariable("number") Integer integer){
        return true;
    }
}
