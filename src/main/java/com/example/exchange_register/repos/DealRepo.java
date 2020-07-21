package com.example.exchange_register.repos;

import com.example.exchange_register.domain.Deal;
import org.springframework.data.repository.CrudRepository;

public interface DealRepo extends CrudRepository<Deal, Long> {
}
