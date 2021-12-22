package dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_payment")
public class PaymentEntity {

    @Id
    @SequenceGenerator(name = "payment_sequence", sequenceName = "payment_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payment_sequence")
    @Column(name = "payment_id")
    private Long paymentId;

    @Column(name = "unit_price")
    private Float unitPrice;

    @Column(name = "date_creation")
    private String dateCreation;

    private String status;

    @Column(name = "payment_type_id")
    private String paymentTypeId;

    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "binary_mode")
    private Boolean binaryMode;


}
