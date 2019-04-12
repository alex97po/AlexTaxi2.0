package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Ride;
import com.pogorelov.alextaxi2.repository.RideRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class RideServiceImpl {

    @Autowired
    RideRepository rideRepository;

    void createRide (Ride ride) {
        rideRepository.save(ride);
    }
}
