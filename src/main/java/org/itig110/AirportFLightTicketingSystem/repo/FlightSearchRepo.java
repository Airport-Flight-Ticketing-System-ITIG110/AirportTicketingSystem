package org.itig110.AirportFLightTicketingSystem.repo;

import org.itig110.AirportFLightTicketingSystem.model.Flight;
import org.itig110.AirportFLightTicketingSystem.dto.FlightSearchInfo;
import org.itig110.AirportFLightTicketingSystem.util.DateUtil;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;


@Component
public class FlightSearchRepo {

    private List<Flight> flightList = initializeFLightData();


    public List<Flight> findAllFlights(FlightSearchInfo flightSearchInfo){
        Optional<List<Flight>> flightsResult = Optional.ofNullable(new ArrayList<>());

        for(Flight flight : this.flightList){
            if(flight.getOrigin().equals(flightSearchInfo.getOrigin())
                && flight.getDestination().equals(flightSearchInfo.getDestination())
                && isEqualDate(flight.getFlightTime(), DateUtil.getLocalDateFromStringOnlyDate(flightSearchInfo.getTime()))){
                flightsResult.get().add(flight);
            }
        }

        return flightsResult.orElse(Collections.emptyList());
    }

    private boolean isEqualDate(LocalDateTime savedTime, LocalDate userTime) {
        return savedTime.getYear() == userTime.getYear()
                && savedTime.getMonth() == userTime.getMonth()
                && savedTime.getDayOfMonth() == userTime.getDayOfMonth();
    }

    public Flight findFlightByNumber(String number) {
        Optional<Flight> savedFlight = Optional.empty();

        for(Flight flight : this.flightList){
            if(flight.getNumber().equals(number)){
                savedFlight = Optional.of(flight);
            }
        }
        return savedFlight.orElse(new Flight("none", "none"));
    }

    private List<Flight> initializeFLightData(){
        List<Flight> flightList = new ArrayList<>();

        Flight flight1 = new Flight();
        flight1.setNumber("1234");
        flight1.setOrigin("Egypt");
        flight1.setDestination("Sudai");
        flight1.setFlightTime("2022-10-20 11:30");

        Flight flight2 = new Flight();
        flight2.setNumber("5678");
        flight2.setOrigin("Alex");
        flight2.setDestination("Dubai");
        flight2.setFlightTime("2022-10-25 11:30");


        Flight flight3 = new Flight();
        flight3.setNumber("1543");
        flight3.setOrigin("Egypt");
        flight3.setDestination("Sudai");
        flight3.setFlightTime("2022-10-20 04:30");

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);

        return flightList;

    }


}
