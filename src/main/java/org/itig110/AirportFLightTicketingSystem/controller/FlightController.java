package org.itig110.AirportFLightTicketingSystem.controller;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.model.FlightSearchInfo;
import org.itig110.AirportFLightTicketingSystem.repo.FlightRepo;
import org.itig110.AirportFLightTicketingSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class FlightController {

    @Autowired
    FlightService flightService;


    @GetMapping("/flight/{number}")
    public Flight findFlightByNumber(@PathVariable("number") String number){
        return flightService.findFlightByNumber(number);
    }

    @PostMapping("/flight")
    public List<Flight> findAllFlights(@RequestBody FlightSearchInfo flightSearchInfo){
        return flightService.findAllFlights(flightSearchInfo);
    }

}
