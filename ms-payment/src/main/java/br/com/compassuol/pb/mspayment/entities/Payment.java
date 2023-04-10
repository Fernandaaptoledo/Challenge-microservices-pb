package br.com.compassuol.pb.mspayment.entities;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    private BigDecimal amountTotal;

//    @ManyToOne()
//    @MapsId
//    private Order order;
}
