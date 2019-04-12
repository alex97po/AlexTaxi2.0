package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Client;

public interface ClientService {
    public void addClient (Client client);
    public void removeClient (Long id);
}
