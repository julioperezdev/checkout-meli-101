package dev.julioperez.checkoutmeli101.checkouts.application.adapter;

import dev.julioperez.checkoutmeli101.checkouts.application.shared.PaymentModelMapper;
import dev.julioperez.checkoutmeli101.checkouts.domain.model.Payment;
import dev.julioperez.checkoutmeli101.checkouts.domain.ports.PaymentRepository;
import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.dao.JpaPaymentDao;
import dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model.PaymentEntity;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class PaymentAdapterRepository implements PaymentRepository {

    private JpaPaymentDao jpaPaymentDao;
    private PaymentModelMapper paymentModelMapper;

    @Override
    public Payment savePayment(Payment payment) {
        PaymentEntity paymentEntitySaved = jpaPaymentDao.save(paymentModelMapper.toEntity(payment));
        return paymentModelMapper.toDto(paymentEntitySaved);
    }

    @Override
    public List<Payment> findAllPayments() {
        List<PaymentEntity> allPayments = jpaPaymentDao.findAll();
        return allPayments
                .stream()
                .map(particularPaymentEntity -> paymentModelMapper.toDto(particularPaymentEntity))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Payment> findPaymentById(Long paymentId) {
        Optional<PaymentEntity> paymentEntityOptional = jpaPaymentDao.findByPaymentIdAndPaymentIdNotNull(paymentId);
        PaymentEntity paymentEntity = paymentEntityOptional.orElseThrow(IllegalStateException::new);
        return Optional.of(paymentModelMapper.toDto(paymentEntity));
    }
}
