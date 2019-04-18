package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.domain.Client;
import com.pogorelov.alextaxi2.domain.ClientAuth;
import com.pogorelov.alextaxi2.repository.ClientAuthRepository;
import com.pogorelov.alextaxi2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {
    @Autowired
    private ClientRepository clientRepository;
    @Autowired
    private ClientAuthRepository clientAuthRepository;

    @GetMapping ("/registration")
    public String registration () {
        return "registration";
    }

    @PostMapping ("/registration")
    public String addUser (ClientAuth clientAuth, Map<String, Object> model) {
        ClientAuth clientFromDB = clientAuthRepository.findByLogin(clientAuth.getLogin());
        if (clientFromDB != null) {
            model.put("message", "User exists!");
            return "registration";
        }
        clientAuthRepository.save(clientAuth);
        return "redirect:/login";
    }
}
