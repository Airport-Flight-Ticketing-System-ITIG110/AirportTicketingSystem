package org.itig110.AirportFLightTicketingSystem.controller;

import org.itig110.AirportFLightTicketingSystem.model.Passenger;
import org.itig110.AirportFLightTicketingSystem.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v3/admin")
public class passengerController {

    @Autowired
    private PassengerService passengerService;


    @GetMapping("/passenger/{number}")
    public Passenger getPassengerByNumber(@PathVariable("number") Integer number){
        return passengerService.getPassengerByID(number);
    }

    @PutMapping("/passenger/{number}")
    public Passenger updatePassenger(@PathVariable("number") Integer number, @RequestBody Passenger passenger){
        passengerService.updatePassenger(passenger);
        return passenger;
    }

    @PostMapping("/passenger")
    public Passenger savePassenger(@RequestBody Passenger passenger){
        return passengerService.savePassenger(passenger);
    }

    @DeleteMapping("/passenger/{number}")
    public String deletePassenger(@PathVariable("number") Integer number){
        passengerService.deletePassengerById(number);
        return "{\"code\": 200, \"message\": \"Success\"}";
    }
}
