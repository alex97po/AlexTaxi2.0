package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.service.ClientAuthService;
import com.pogorelov.alextaxi2.service.ClientAuthServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientAuthController {

    @Autowired
    ClientAuthServiceImpl clientAuthServiceImpl;

    @RequestMapping("/login")
    public String login (String login, String password) {
        if (clientAuthServiceImpl.auth(login, password)) {
            return "redirect:/ride-request";
        }
        return "redirect:/";
    }
}
