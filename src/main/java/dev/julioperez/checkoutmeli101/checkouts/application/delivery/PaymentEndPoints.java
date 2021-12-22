package dev.julioperez.checkoutmeli101.checkouts.application.delivery;

import dev.julioperez.checkoutmeli101.checkouts.application.createPayment.PaymentCreator;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentRequest;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;

import java.io.IOException;
import java.util.List;

public class PaymentEndPoints {

    private PaymentCreator paymentCreator;

    public Payment createPayment(PaymentRequest paymentRequest) throws IOException {
        return paymentCreator.createPayment(paymentRequest);
    }

//    public List<Payment> getAllPayment(){
//        return
//    }


}
