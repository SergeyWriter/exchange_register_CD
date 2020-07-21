package com.example.exchange_register.controller;

import com.example.exchange_register.domain.CompanySeller;
import com.example.exchange_register.repos.CompanySellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.persistence.Convert;
import java.util.Map;

@Controller
public class GreetingController {
    @GetMapping
    public String greeting(Map<String, Object> map) {
        return "greeting";
    }
}
