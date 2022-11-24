package org.itig110.AirportFLightTicketingSystem.model;

import javax.persistence.*;

@Entity
@Table(name = "tickets")
public class Ticket  {

	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name = "id")
	private Integer id;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "passenger_id", referencedColumnName = "id")
 	private Passenger passenger;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "flight_id", referencedColumnName = "id")
 	private Flight flight;

 	public Integer getId() {
		 return id;
 	}

	public Flight getFlight() {
		return flight;
	}

	public void setFlight(Flight flight) {
		this.flight = flight;
	}

	public void setId(Integer id) {
  this.id = id;
 }

	 public Passenger getPassenger() {
	  return passenger;
	 }

	 public void setPassenger(Passenger passenger) {
	  this.passenger = passenger;
	 }
}