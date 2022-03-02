package com.finbev.services.caseservice.repos;

import com.finbev.services.caseservice.models.Case;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CaseRepository extends JpaRepository<Case, Long> {
}