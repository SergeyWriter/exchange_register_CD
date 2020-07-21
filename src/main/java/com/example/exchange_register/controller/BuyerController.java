package com.example.exchange_register.controller;

import com.example.exchange_register.domain.Buyer;
import com.example.exchange_register.domain.CompanySeller;
import com.example.exchange_register.repos.BuyerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class BuyerController {
    @Autowired
    private BuyerRepo buyerRepo;

    @GetMapping("/buyer")
    public String rootBuyer(Map<String, Object> map) {
        Iterable<Buyer> buyers = buyerRepo.findAll();
        map.put("buyers", buyers);
        return "/buyer";
    }

    @PostMapping("/buyer")
    public String addBuyer(
            @RequestParam Integer buyerIdentifier,
            @RequestParam String buyerInitials,
            @RequestParam String buyerAddress,
            @RequestParam String buyerPhoneNumber,
            Map<String, Object> map) {
        Buyer buyer = new Buyer((int) buyerRepo.count() + 1, buyerIdentifier, buyerInitials, buyerAddress, buyerPhoneNumber);
        buyerRepo.save(buyer);
        Iterable<Buyer> buyers = buyerRepo.findAll();
        map.put("buyers", buyers);
        return "/buyer";
    }
}
