package com.finbev.services.caseservice.services;

import com.finbev.services.caseservice.models.Case;
import org.springframework.data.repository.PagingAndSortingRepository;


public interface CaseRepository extends PagingAndSortingRepository<Case, Long> {
}