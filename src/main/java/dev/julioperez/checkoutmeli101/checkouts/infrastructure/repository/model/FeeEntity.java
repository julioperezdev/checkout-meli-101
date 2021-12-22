package dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_fee")
public class FeeEntity {

    @Id
    @SequenceGenerator(name = "fee_sequence", sequenceName = "fee_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "fee_sequence")
    @Column(name = "fee_id")
    private Long feeId;

    @Column(name = "fee_type")
    private String feeType;

    @Column(name = "fee_amount")
    private Float feeAmount;

    @Column(name = "fee_payer")
    private String feePayer;

    @Column(name = "payment_id")
    private Long paymentId;

}
