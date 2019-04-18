package com.pogorelov.alextaxi2.service;

import com.pogorelov.alextaxi2.domain.Client;
import com.pogorelov.alextaxi2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;

@Service
public class ClientServiceImpl implements ClientService {
    @Autowired
    ClientRepository clientRepository;
    @Transactional
    public void addClient(Client client) {
        clientRepository.save(client);
    }
    @Override
    public void removeClient(Long id) {
        //TODO не получается удалить по id, возвращает Optional
    }

    @Override
    public UserDetails loadUserByUsername(String name) throws UsernameNotFoundException {
        return clientRepository.findByName(name);
    }
}
