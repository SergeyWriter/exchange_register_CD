package com.example.exchange_register.repos;

import com.example.exchange_register.domain.Buyer;
import org.springframework.data.repository.CrudRepository;

public interface BuyerRepo extends CrudRepository<Buyer, Long> {
}
