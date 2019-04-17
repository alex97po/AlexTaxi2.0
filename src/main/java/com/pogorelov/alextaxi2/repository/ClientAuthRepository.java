package com.pogorelov.alextaxi2.repository;

import com.pogorelov.alextaxi2.domain.ClientAuth;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface ClientAuthRepository extends CrudRepository <ClientAuth, Long> {
    List<ClientAuth> findByLoginAndPassword (String login, String password);
}
