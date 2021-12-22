package dev.julioperez.checkoutmeli101.checkouts.domain.ports;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;

import java.util.List;

public interface PaymentFinderClient {

    List<PaymentResponse> getAllPayments();
}
