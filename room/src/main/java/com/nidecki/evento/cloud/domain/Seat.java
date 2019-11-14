package com.nidecki.evento.cloud.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
@Entity
public class Seat {

    @GeneratedValue
    private Long id;
    private boolean isReserved;
    private boolean isExists;

}
