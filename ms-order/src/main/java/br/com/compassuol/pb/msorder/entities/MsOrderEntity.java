package br.com.compassuol.pb.msorder.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MsOrderEntity {

    @Id
    @Column(name = "ID", nullable = false)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "CPF", nullable = false)
    private String cpf;

    @Column(name = "AMOUNT", nullable = false)
    private Double amount;

    @Column(name = "ORDER_STATUS", nullable = false)
    private String orderStatus;

    @Column(name = "PAYMENT_STATUS", nullable = false)
    private String paymentStatus;

}
