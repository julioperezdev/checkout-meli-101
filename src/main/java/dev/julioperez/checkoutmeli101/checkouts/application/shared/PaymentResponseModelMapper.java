package dev.julioperez.checkoutmeli101.checkouts.application.shared;

import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentResponse;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PaymentEntity;

public class PaymentResponseModelMapper {

    public Payment toDto(PaymentResponse paymentResponse){
        return new Payment(
                paymentResponse.getPaymentId(),
                paymentResponse.getUnitPrice(),
                paymentResponse.getDateCreation(),
                paymentResponse.getStatus(),
                paymentResponse.getPaymentTypeId(),
                paymentResponse.getCurrencyId(),
                paymentResponse.getBinaryMode());
    }

}
