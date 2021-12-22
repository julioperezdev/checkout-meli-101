package dev.julioperez.checkoutmeli101.checkouts.application.findPayment;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.ports.PaymentFinderClient;

import java.util.List;

public class PaymentFinder implements PaymentFinderClient {


    @Override
    public List<PaymentResponse> getAllPayments() {
        return null;
    }
}
