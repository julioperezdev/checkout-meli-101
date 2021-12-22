package dev.julioperez.checkoutmeli101.checkouts.domain.ports;

import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;

import java.util.List;
import java.util.Optional;

public interface PaymentRepository {

    Payment savePayment(Payment payment);
    List<Payment> findAllPayments();
    Optional<Payment> findPaymentById(Long paymentId);

}
