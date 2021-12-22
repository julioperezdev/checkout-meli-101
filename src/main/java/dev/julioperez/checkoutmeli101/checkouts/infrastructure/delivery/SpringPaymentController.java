package dev.julioperez.checkoutmeli101.checkouts.infrastructure.delivery;

import dev.julioperez.checkoutmeli101.checkouts.application.delivery.PaymentEndPoints;
import dev.julioperez.checkoutmeli101.checkouts.domain.dto.PaymentRequest;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PaymentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class SpringPaymentController {

    private PaymentEndPoints paymentEndPoints;

    @PostMapping("/create")
    public Payment createPayment (@RequestBody PaymentRequest paymentRequest) throws IOException {
        return paymentEndPoints.createPayment(paymentRequest);
    }
//
//    @GetMapping("/getall")
//    public List<Payment> getAllPayments(){
//        return paymentEndPoints.
//    }


}
