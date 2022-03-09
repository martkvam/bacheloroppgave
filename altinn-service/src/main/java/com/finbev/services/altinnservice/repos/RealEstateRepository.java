package com.finbev.services.altinnservice.repos;

import com.finbev.services.altinnservice.models.RealEstate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RealEstateRepository extends JpaRepository<RealEstate, Long> {
}
