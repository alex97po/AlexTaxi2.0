package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;

public interface ClientRepository extends CrudRepository <Client, Long> {

    @Override
    @RestResource(exported = false)
    <S extends Client> S save(S s);

    @Override
    @RestResource(exported = false)
    <S extends Client> Iterable<S> saveAll(Iterable<S> iterable);

    @Override
    @RestResource(exported = false)
    void deleteById(Long aLong);

    @Override
    @RestResource(exported = false)
    void delete(Client client);

    @Override
    @RestResource(exported = false)
    void deleteAll(Iterable<? extends Client> iterable);

    @Override
    @RestResource(exported = false)
    void deleteAll();

}
