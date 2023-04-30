package com.frank.entitiy;


import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order extends BaseEntity{

    private BigDecimal pairPrice;
    private BigDecimal totalPrice;

    @OneToOne
    private Cart cart;
    @ManyToOne
    private Customer customer;
    @OneToOne
    private Payment payment;
}
