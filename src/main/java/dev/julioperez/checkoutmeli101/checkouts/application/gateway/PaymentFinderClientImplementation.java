package dev.julioperez.checkoutmeli101.checkouts.application.gateway;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.ports.PaymentFinderClient;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

public class PaymentFinderClientImplementation implements PaymentFinderClient {

    private static String HOST = "https://api.mercadopago.com/v1/payments/search?sort=date_created&criteria=desc&external_reference=ID_REF";
    private RestTemplate restTemplate;

    @Override
    public List<PaymentResponse> getAllPayments() {
        return (List<PaymentResponse>) Optional.ofNullable(
                restTemplate.getForObject(HOST, PaymentResponse.class ))
                .orElseThrow(IllegalStateException::new);
    }
}
