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

    public Flight saveFlight(Flight flight){return flightRepo.save(flight);}

    public Flight getFlightById(Long id)
    {
        return flightRepo.findById(id).get();
    }

    public void updateFlight(Flight flight) {flightRepo.save(flight);}

    public void deleteFlight(Long id)
    {
        flightRepo.deleteById(id);
    }

//    public List<Flight> findAllFlights(FlightSearchInfo flightSearchInfo){
//        return flightSearchRepo.findAllFlights(flightSearchInfo);
//    }
//
//    public Flight findFlightByNumber(String number) {
//        return flightSearchRepo.findFlightByNumber(number);
//    }

}
