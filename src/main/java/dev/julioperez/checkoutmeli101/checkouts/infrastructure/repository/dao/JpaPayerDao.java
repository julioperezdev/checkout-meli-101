package dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.dao;

import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PayerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaPayerDao extends JpaRepository<PayerEntity, Long> {
}
