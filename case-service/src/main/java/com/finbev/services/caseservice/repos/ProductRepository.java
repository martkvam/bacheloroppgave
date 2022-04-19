package com.finbev.services.caseservice.repos;

import com.finbev.services.caseservice.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
