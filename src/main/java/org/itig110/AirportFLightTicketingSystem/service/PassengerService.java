package org.itig110.AirportFLightTicketingSystem.service;

import org.itig110.AirportFLightTicketingSystem.model.Passenger;
import org.itig110.AirportFLightTicketingSystem.repo.PassengerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PassengerService {

    @Autowired
    private PassengerRepo passengerRepo;

    public Passenger savePassenger(Passenger passenger){
        return passengerRepo.save(passenger);
    }

    public Passenger getPassengerByID(int id)
    {
        return passengerRepo.findById(id).get();
    }

    public void updatePassenger(Passenger passenger)
    {
        passengerRepo.save(passenger);
    }

    public void deletePassengerById(int id)
    {
        passengerRepo.deleteById(id);
    }
}
