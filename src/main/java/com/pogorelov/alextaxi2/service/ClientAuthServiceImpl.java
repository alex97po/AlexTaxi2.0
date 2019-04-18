package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.ClientAuth;
import com.pogorelov.alextaxi2.repository.ClientAuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class ClientAuthServiceImpl implements ClientAuthService {

    @Autowired
    ClientAuthRepository clientAuthRepository;

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        return clientAuthRepository.findByLogin(login);
    }
}
