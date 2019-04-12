package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping("/")
    public String home() {
        return "redirect:/login";
    }


}
