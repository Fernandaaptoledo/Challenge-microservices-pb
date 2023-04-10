package br.com.compassuol.pb.msorder.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;
import java.util.List;


@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public  class Order {

    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Size(min =11, max= 11)
    @NotNull
    private String cpf;

    @NotNull
    private BigDecimal amount;

    @OneToMany(mappedBy = "Order", cascade = CascadeType.ALL)
    private List<OrderItem> items;

    @NotNull
    private String orderStatus;

    @NotNull
    private String paymentStatus;

    @Id
    @NotNull
    private Long idPayment;

//    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
//    private Payment payment;
}
