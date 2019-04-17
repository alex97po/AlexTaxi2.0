package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.Ride;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends CrudRepository <Ride, Long> {

}
