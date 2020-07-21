package com.example.exchange_register.domain;

import javax.persistence.*;

@Entity
@Table
public class BuyerJuridical {
    @Id
    private Integer id;

    private String companyBuyerTaxpayerIdentificationNumber;
    private String buyerMailbox;

    @OneToOne
    @MapsId
    private Buyer buyer;

    public BuyerJuridical() {
    }

    public BuyerJuridical(String companyBuyerTaxpayerIdentificationNumber, String buyerMailbox) {
        this.companyBuyerTaxpayerIdentificationNumber = companyBuyerTaxpayerIdentificationNumber;
        this.buyerMailbox = buyerMailbox;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanyBuyerTaxpayerIdentificationNumber() {
        return companyBuyerTaxpayerIdentificationNumber;
    }

    public void setCompanyBuyerTaxpayerIdentificationNumber(String companyBuyerTaxpayerIdentificationNumber) {
        this.companyBuyerTaxpayerIdentificationNumber = companyBuyerTaxpayerIdentificationNumber;
    }

    public String getBuyerMailbox() {
        return buyerMailbox;
    }

    public void setBuyerMailbox(String buyerMailbox) {
        this.buyerMailbox = buyerMailbox;
    }

    public Buyer getBuyer() {
        return buyer;
    }

    public void setBuyer(Buyer buyer) {
        this.buyer = buyer;
    }
}
