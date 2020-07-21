package com.example.exchange_register.domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table
public class CompanySeller {
    private Integer id;

    @Id
    private String companySellerTaxpayerIdentificationNumber;

    private String companySellerName;
    private String companySellerAddress;
    private Integer controllingStakeValue;
    private Integer sharesToSellNumber;
    private Integer sharePrice;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "companySeller", cascade = CascadeType.ALL)
    private List<Deal> deals;

    public CompanySeller() {
    }

    public CompanySeller(Integer id, String companySellerTaxpayerIdentificationNumber, String companySellerName, String companySellerAddress, Integer controllingStakeValue, Integer sharesToSellNumber, Integer sharePrice) {
        this.id = id;
        this.companySellerTaxpayerIdentificationNumber = companySellerTaxpayerIdentificationNumber;
        this.companySellerName = companySellerName;
        this.companySellerAddress = companySellerAddress;
        this.controllingStakeValue = controllingStakeValue;
        this.sharesToSellNumber = sharesToSellNumber;
        this.sharePrice = sharePrice;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCompanySellerTaxpayerIdentificationNumber() {
        return companySellerTaxpayerIdentificationNumber;
    }

    public void setCompanySellerTaxpayerIdentificationNumber(String companySellerTaxpayerIdentificationNumber) {
        this.companySellerTaxpayerIdentificationNumber = companySellerTaxpayerIdentificationNumber;
    }

    public String getCompanySellerName() {
        return companySellerName;
    }

    public void setCompanySellerName(String companySellerName) {
        this.companySellerName = companySellerName;
    }

    public String getCompanySellerAddress() {
        return companySellerAddress;
    }

    public void setCompanySellerAddress(String companySellerAddress) {
        this.companySellerAddress = companySellerAddress;
    }

    public Integer getControllingStakeValue() {
        return controllingStakeValue;
    }

    public void setControllingStakeValue(Integer controllingStakeValue) {
        this.controllingStakeValue = controllingStakeValue;
    }

    public Integer getSharesToSellNumber() {
        return sharesToSellNumber;
    }

    public void setSharesToSellNumber(Integer sharesToSellNumber) {
        this.sharesToSellNumber = sharesToSellNumber;
    }

    public Integer getSharePrice() {
        return sharePrice;
    }

    public void setSharePrice(Integer sharePrice) {
        this.sharePrice = sharePrice;
    }

    public List<Deal> getDeals() {
        return deals;
    }

    public void setDeals(List<Deal> deals) {
        this.deals = deals;
    }
}
