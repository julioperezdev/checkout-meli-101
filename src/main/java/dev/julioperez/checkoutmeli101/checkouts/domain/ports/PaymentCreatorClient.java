package dev.julioperez.checkoutmeli101.checkouts.domain.ports;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentRequest;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public interface PaymentCreatorClient {

    PaymentResponse createPayment(PaymentRequest paymentRequest) throws IOException;
}
