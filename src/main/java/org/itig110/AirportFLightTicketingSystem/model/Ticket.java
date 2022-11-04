package org.itig110.AirportFLightTicketingSystem.model;
public class Ticket  {

 private String number;
 private Passenger passenger;
 private Flight flight;

 public String getNumber() {
  return number;
 }

 public void setNumber(String number) {
  this.number = number;
 }

 public Passenger getPassenger() {
  return passenger;
 }

 public void setPassenger(Passenger passenger) {
  this.passenger = passenger;
 }
}