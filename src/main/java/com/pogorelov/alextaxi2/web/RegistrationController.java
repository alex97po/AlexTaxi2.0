package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.domain.ClientAuth;
import com.pogorelov.alextaxi2.domain.Role;
import com.pogorelov.alextaxi2.repository.ClientAuthRepository;
import com.pogorelov.alextaxi2.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;


@Controller
public class RegistrationController {

    @Autowired
    private ClientAuthRepository clientAuthRepository;

    @GetMapping ("/registration")
    public String registration () {
        return "registration";
    }

    @GetMapping ("/registration-proceeding")
    public String addUser (ClientAuth clientAuth, Model model) {
        ClientAuth clientFromDB = clientAuthRepository.findByLogin(clientAuth.getLogin());
        if (clientFromDB != null) {
//            model.addAttribute("message", "User exists!");
            return "registration";
        }
        clientAuth.setRoles(Collections.singleton(Role.CLIENT));
        clientAuthRepository.save(clientAuth);
        return "redirect:/login";
    }
}
