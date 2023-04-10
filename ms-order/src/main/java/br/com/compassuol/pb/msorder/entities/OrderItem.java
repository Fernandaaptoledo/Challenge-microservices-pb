package br.com.compassuol.pb.msorder.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String description;

    @NotNull
    private LocalDate creationDate;

    @NotNull
    private LocalDate expirationDate;

    @NotNull
    private BigDecimal amount;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY )
    @JoinColumn(name ="order_id")
    private Order order;
}
