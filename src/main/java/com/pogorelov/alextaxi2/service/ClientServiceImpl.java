package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Client;
import com.pogorelov.alextaxi2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class ClientServiceImpl {
    @Autowired
    ClientRepository clientRepository;
    @Transactional
    public void addClient(Client client) {
        clientRepository.save(client);
    }


}
