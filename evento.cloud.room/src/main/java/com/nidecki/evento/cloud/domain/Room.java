package com.nidecki.evento.cloud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Room {

    @GeneratedValue
    private Long id;
    private String name;
    private Seat[][] seats;
}
