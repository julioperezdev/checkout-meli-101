package dev.julioperez.checkoutmeli101.checkouts.application.shared;

import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PaymentEntity;

public class PaymentModelMapper {

    public Payment toDto(PaymentEntity paymentEntity){
        return new Payment(
                paymentEntity.getPaymentId(),
                paymentEntity.getUnitPrice(),
                paymentEntity.getDateCreation(),
                paymentEntity.getStatus(),
                paymentEntity.getPaymentTypeId(),
                paymentEntity.getCurrencyId(),
                paymentEntity.getBinaryMode());
    }

    public PaymentEntity toEntity(Payment payment){
        return new PaymentEntity(
                payment.getPaymentId(),
                payment.getUnitPrice(),
                payment.getDateCreation(),
                payment.getStatus(),
                payment.getPaymentTypeId(),
                payment.getCurrencyId(),
                payment.getBinaryMode());
    }
}
