package com.ganggood.autowork.repository;

import com.ganggood.autowork.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Long> {
}
