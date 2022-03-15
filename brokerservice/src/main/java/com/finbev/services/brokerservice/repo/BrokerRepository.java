package com.finbev.services.brokerservice.repo;

import com.finbev.services.brokerservice.models.Broker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerRepository extends JpaRepository<Broker, Long> {
}
