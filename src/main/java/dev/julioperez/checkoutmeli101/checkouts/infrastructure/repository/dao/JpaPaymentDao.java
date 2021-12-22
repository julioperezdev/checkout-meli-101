package dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.dao;

import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface JpaPaymentDao extends JpaRepository<PaymentEntity, Long> {
    Optional<PaymentEntity> findByPaymentIdAndPaymentIdNotNull(Long paymentId);
}
