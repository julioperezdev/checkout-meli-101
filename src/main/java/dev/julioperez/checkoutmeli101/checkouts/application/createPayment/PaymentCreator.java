package dev.julioperez.checkoutmeli101.checkouts.application.createPayment;

import dev.julioperez.checkoutmeli101.checkouts.application.adapter.PaymentAdapterRepository;
import dev.julioperez.checkoutmeli101.checkouts.application.shared.PaymentResponseModelMapper;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentRequest;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.domain.ports.PaymentCreatorClient;

import java.io.IOException;

public class PaymentCreator{

    private PaymentAdapterRepository paymentAdapterRepository;
    private PaymentCreatorClient paymentCreatorClient;
    private PaymentResponseModelMapper paymentResponseModelMapper;

    public Payment createPayment(PaymentRequest paymentRequest) throws IOException {
        PaymentResponse paymentCreatedResponse = paymentCreatorClient.createPayment(paymentRequest);
        Payment payment = paymentResponseModelMapper.toDto(paymentCreatedResponse);
        return paymentAdapterRepository.savePayment(payment);
    }
}
