package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Client;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface ClientService extends UserDetailsService {
    public void addClient (Client client);
    public void removeClient (Long id);
}
