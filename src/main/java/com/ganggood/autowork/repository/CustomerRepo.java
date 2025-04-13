package com.ganggood.autowork.repository;

import com.ganggood.autowork.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer,Long> {
}
