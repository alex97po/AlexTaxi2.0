package com.pogorelov.alextaxi2.web;

import com.pogorelov.alextaxi2.domain.Client;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping ("/")
    public String main() {
        return "index";
    }

    @GetMapping ("/taxiorder")
    public String taxiOrder() {
        return "taxiorder";
    }
}
