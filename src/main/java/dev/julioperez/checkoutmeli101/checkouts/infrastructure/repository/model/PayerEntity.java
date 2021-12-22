package dev.julioperez.checkoutmeli101.checkouts.infrastructure.repository.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "table_payer")
public class PayerEntity {

    @Id
    @SequenceGenerator(name = "payer_sequence", sequenceName = "payer_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payer_sequence")
    @Column(name = "payer_id")
    private Long payerId;

    @Column(name = "payment_mercadolibre_id")
    private String payerMercadoLibreId;

    @Column(name = "payer_type")
    private String payerType;

    @Column(name = "payer_email")
    private String payerEmail;

    @Column(name = "payment_id")
    private Long paymentId;

}
