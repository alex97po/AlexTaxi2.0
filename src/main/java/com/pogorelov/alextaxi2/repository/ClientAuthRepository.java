package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.ClientAuth;
import org.springframework.data.repository.CrudRepository;


public interface ClientAuthRepository extends CrudRepository <ClientAuth, Long> {
    ClientAuth findByLoginAndPassword (String login, String password);
}
