package org.itig110.AirportFLightTicketingSystem.model;

import org.hibernate.annotations.CreationTimestamp;
import org.itig110.AirportFLightTicketingSystem.util.DateUtil;
import javax.annotation.processing.Generated;
import javax.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "flight")
public class Flight {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    private String number;
    private String origin;
    private String destination;

    private LocalDateTime flightTime;

    @OneToOne(mappedBy = "flight")
    private Ticket ticket;

    @CreationTimestamp
    private LocalDateTime creationTime;


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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(String flightTime) {
        this.flightTime = DateUtil.getLocalDateFromString(flightTime);
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }
}
