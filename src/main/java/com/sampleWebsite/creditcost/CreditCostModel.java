package com.sampleWebsite.creditcost;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "cost")
public class CreditCostModel {
    @Getter private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;
    @Getter @Setter String CreditCost;
    @Getter @Setter String Discount;

    @Override
    public String toString() {
        return "CreditCostModel{" +
                "id=" + id +
                ", credit_cost='" + CreditCost + '\'' +
                ", discount='" + Discount + '\'' +
                '}';
    }
}
