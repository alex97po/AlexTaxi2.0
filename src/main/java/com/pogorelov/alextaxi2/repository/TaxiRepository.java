package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.Taxi;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

public interface TaxiRepository extends CrudRepository <Taxi, Long> {
    List<Taxi> findByCarType (String carType);

    @Override
    @RestResource(exported = false)
    <S extends Taxi> S save(S s);

    @Override
    @RestResource(exported = false)
    <S extends Taxi> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(Taxi taxi);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Taxi> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();
}
