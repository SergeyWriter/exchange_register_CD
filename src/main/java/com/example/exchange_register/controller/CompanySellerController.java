package com.example.exchange_register.controller;

import com.example.exchange_register.domain.CompanySeller;
import com.example.exchange_register.repos.CompanySellerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
public class CompanySellerController {
    @Autowired
    private CompanySellerRepo companySellerRepo;

    @RequestMapping(value = "/companyseller", method = RequestMethod.GET)
    public String rootCompanySeller(Map<String, Object> map) {
        Iterable<CompanySeller> companySellers = companySellerRepo.findAll();
        map.put("companySellers", companySellers);
        return "/companyseller";
    }

    @RequestMapping(value = "/companyseller", method = RequestMethod.POST)
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

    //@PostMapping("/update/{companySellerTaxpayerIdentificationNumber}")
    //public String update(Map<String, Object> map) {
//
    //    return "/companyseller";
    //}

    @RequestMapping(value = "/companyseller/delete/{TIN}", method = RequestMethod.POST)
    public String deleteCompanySeller(@PathVariable(name = "TIN") String TIN, Map<String, Object> map) {
        companySellerRepo.deleteById(TIN);
        Iterable<CompanySeller> companySellers = companySellerRepo.findAll();
        map.put("companySellers", companySellers);
        return "/companyseller";
    }
}

///{companySellerTaxpayerIdentificationNumber}
///<input type="hidden" name="TIN" value=${companyseller.companySellerTaxpayerIdentificationNumber}>
///<button type="submit" class="btn btn-secondary">Удалить</button>
///action="/companyseller/delete/${companyseller.companySellerTaxpayerIdentificationNumber}"
///method="post"