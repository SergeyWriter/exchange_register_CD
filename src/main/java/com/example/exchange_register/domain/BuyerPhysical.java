package com.example.exchange_register.domain;

import javax.persistence.*;

@Entity
@Table
public class BuyerPhysical {
    @Id
    private Integer id;

    @OneToOne
    @MapsId
    private Buyer buyer;

    public BuyerPhysical() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
