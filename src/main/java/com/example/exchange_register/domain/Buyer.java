package com.example.exchange_register.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class Buyer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Id
    private Integer buyerIdentifier;

    private String buyerInitials;
    private String buyerAddress;
    private String buyerPhoneNumber;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "buyer")
    private List<Deal> deals;

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL)
    private BuyerPhysical buyerPhysical;

    @OneToOne(mappedBy = "buyer", cascade = CascadeType.ALL)
    private BuyerJuridical buyerJuridical;

    public Buyer() {
    }

    public Buyer(Integer id, Integer buyerIdentifier, String buyerInitials, String buyerAddress, String buyerPhoneNumber) {
        this.id = id;
        this.buyerIdentifier = buyerIdentifier;
        this.buyerInitials = buyerInitials;
        this.buyerAddress = buyerAddress;
        this.buyerPhoneNumber = buyerPhoneNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getBuyerIdentifier() {
        return buyerIdentifier;
    }

    public void setBuyerIdentifier(Integer buyerIdentifier) {
        this.buyerIdentifier = buyerIdentifier;
    }

    public String getBuyerInitials() {
        return buyerInitials;
    }

    public void setBuyerInitials(String buyerInitials) {
        this.buyerInitials = buyerInitials;
    }

    public String getBuyerAddress() {
        return buyerAddress;
    }

    public void setBuyerAddress(String buyerAddress) {
        this.buyerAddress = buyerAddress;
    }

    public String getBuyerPhoneNumber() {
        return buyerPhoneNumber;
    }

    public void setBuyerPhoneNumber(String buyerPhoneNumber) {
        this.buyerPhoneNumber = buyerPhoneNumber;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }

    public BuyerPhysical getBuyerPhysical() {
        return buyerPhysical;
    }

    public void setBuyerPhysical(BuyerPhysical buyerPhysical) {
        this.buyerPhysical = buyerPhysical;
    }

    public BuyerJuridical getBuyerJuridical() {
        return buyerJuridical;
    }

    public void setBuyerJuridical(BuyerJuridical buyerJuridical) {
        this.buyerJuridical = buyerJuridical;
    }
}
