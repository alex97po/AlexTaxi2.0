package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.ClientAuth;
import com.pogorelov.alextaxi2.repository.ClientAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientAuthServiceImpl implements ClientAuthService {

    @Autowired
    ClientAuthRepository clientAuthRepository;

    @Override
    public boolean auth(String login, String password) {
        ClientAuth clientAuth = clientAuthRepository.findByLoginAndPassword(login, password).get(0);
        if (clientAuth!=null) {
            return true;
        }
        return false;
    }
}
