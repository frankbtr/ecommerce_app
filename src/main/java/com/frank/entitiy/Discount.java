package com.frank.entitiy;

import com.frank.enums.DiscountType;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.math.BigDecimal;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Discount extends BaseEntity{

    private BigDecimal discount;
    private String name;
    @Enumerated(EnumType.STRING)
    private DiscountType discountType;
}
