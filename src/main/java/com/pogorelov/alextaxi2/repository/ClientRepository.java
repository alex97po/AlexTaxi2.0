package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RestResource;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository <Client, Long> {
    Client findByName (String name);
}
