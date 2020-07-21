package com.example.exchange_register.repos;

import com.example.exchange_register.domain.CompanySeller;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CompanySellerRepo extends CrudRepository<CompanySeller, String> {
    //List<CompanySeller> findBycompanySellerTaxpayerIdentificationNumber(String taxpayerIdentificationNumber);
}
