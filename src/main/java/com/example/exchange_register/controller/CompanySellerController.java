package com.example.exchange_register.controller;

import com.example.exchange_register.domain.CompanySeller;
import com.example.exchange_register.repos.CompanySellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

@Controller
public class CompanySellerController {
    @Autowired
    private CompanySellerRepo companySellerRepo;

    @GetMapping("/companyseller")
    public String rootCompanySeller(Map<String, Object> map) {
        Iterable<CompanySeller> companySellers = companySellerRepo.findAll();
        map.put("companySellers", companySellers);
        return "/companyseller";
    }

    @PostMapping("/companyseller")
    public String addCompanySeller(
            @RequestParam String companySellerTaxpayerIdentificationNumber,
            @RequestParam String companySellerName,
            @RequestParam String companySellerAddress,
            @RequestParam Integer controllingStakeValue,
            @RequestParam Integer sharesToSellNumber,
            @RequestParam Integer sharePrice,
            Map<String, Object> map) {
        CompanySeller companySeller = new CompanySeller((int) companySellerRepo.count() + 1, companySellerTaxpayerIdentificationNumber, companySellerName, companySellerAddress,
                controllingStakeValue, sharesToSellNumber, sharePrice);
        companySellerRepo.save(companySeller);
        Iterable<CompanySeller> companySellers = companySellerRepo.findAll();
        map.put("companySellers", companySellers);
        return "/companyseller";
    }

    @PostMapping("/update/{companySellerTaxpayerIdentificationNumber}")
    public String update(Map<String, Object> map) {

        return "/companyseller";
    }

    @DeleteMapping("/delete/{companySellerTaxpayerIdentificationNumber}")
    public String delete(@RequestParam String companySellerTaxpayerIdentificationNumber, Map<String, Object> map) {
        companySellerRepo.deleteById(companySellerTaxpayerIdentificationNumber);
        Iterable<CompanySeller> companySellers = companySellerRepo.findAll();
        map.put("companySellers", companySellers);
        return "/companyseller";
    }
}