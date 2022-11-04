package org.itig110.AirportFLightTicketingSystem.service;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.repo.FlightRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class FlightService {

    @Autowired
    private FlightRepo flightRepo;

//    public List<Flight> findAllFlights(FlightSearchInfo flightSearchInfo){
//        return flightSearchRepo.findAllFlights(flightSearchInfo);
//    }
//
//    public Flight findFlightByNumber(String number) {
//        return flightSearchRepo.findFlightByNumber(number);
//    }

    public Flight saveFlight(Flight flight){
        return flightRepo.save(flight);
    }
}
