package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface TaxiRepository extends CrudRepository <Taxi, Long> {
    List<Taxi> findByCarType (String carType);
}
