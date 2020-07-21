package com.example.exchange_register.domain;

import javax.persistence.*;
import java.util.Calendar;

@Entity
@Table
public class Deal {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    //@Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "companySellerTaxpayerIdentificationNumber")
    private CompanySeller companySeller;

    //@Id
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "buyerIdentifier")
    private Buyer buyer;

    @Id
    private Calendar dealDate;

    private Integer sharesPurchasedNumber;

    public Deal() {
    }

    public Deal(CompanySeller companySeller, Buyer buyer, Calendar dealDate, Integer sharesPurchasedNumber) {
        this.companySeller = companySeller;
        this.buyer = buyer;
        this.dealDate = dealDate;
        this.sharesPurchasedNumber = sharesPurchasedNumber;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CompanySeller getCompanySeller() {
        return companySeller;
    }

    public void setCompanySeller(CompanySeller companySeller) {
        this.companySeller = companySeller;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }

    public Calendar getDealDate() {
        return dealDate;
    }

    public void setDealDate(Calendar dealDate) {
        this.dealDate = dealDate;
    }

    public Integer getSharesPurchasedNumber() {
        return sharesPurchasedNumber;
    }

    public void setSharesPurchasedNumber(Integer sharesPurchasedNumber) {
        this.sharesPurchasedNumber = sharesPurchasedNumber;
    }
}
