package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Taxi;
import com.pogorelov.alextaxi2.repository.TaxiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaxiServiceImpl {

    @Autowired
    TaxiRepository taxiRepository;

    List<Taxi> findTaxiByCarType (String carType) {
        return taxiRepository.findByCarType(carType);
    }
}
