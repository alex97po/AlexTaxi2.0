package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.service.ClientService;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ClientController {

    @Autowired
    ClientService clientService;

    @RequestMapping ("/")
    public String main() {
        return "index";
    }

    @GetMapping ("/taxiorder")
    public String taxiOrder() {
        return "taxiorder";
    }

    @PostMapping("/taxiorder")
    public String taxiOrder1() {
        return "taxiorder";
    }


}
