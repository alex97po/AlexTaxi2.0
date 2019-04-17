package com.pogorelov.alextaxi2.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class Ride {
    @Id
    @GeneratedValue
    private long id;

    @Column
    private BigDecimal cost;
    @Column
    private double distance;

    @OneToOne
    private Client client;

    @OneToOne
    private Taxi taxi;
}