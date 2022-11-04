package org.itig110.AirportFLightTicketingSystem.model;

import java.time.LocalDateTime;

public class Flight
{
    private String number;
    private String origin;
    private String destination;
    private LocalDateTime time;

    public Flight() {
    }

    public Flight(String origin, String destination) {
        this.origin = origin;
        this.destination = destination;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }
}
