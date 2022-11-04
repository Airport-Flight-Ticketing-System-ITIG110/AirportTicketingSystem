package org.itig110.AirportFLightTicketingSystem.controller;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.dto.FlightSearchInfo;
import org.itig110.AirportFLightTicketingSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/search/api/v1")
public class FlightSearchController {

    @Autowired
    FlightService flightService;


//    @GetMapping("/flight/{number}")
//    public Flight findFlightByNumber(@PathVariable("number") String number){
//        return flightService.findFlightByNumber(number);
//    }
//
//    @GetMapping("/flights")
//    public List<Flight> findAllFlightsByCriteria(@RequestBody FlightSearchInfo flightSearchInfo){
//        return flightService.findAllFlights(flightSearchInfo);
//    }

}
