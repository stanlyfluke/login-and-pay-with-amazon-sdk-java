package com.amazon.payments.lpa.response.autogenerated.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SellerBillingAgreementAttributes", propOrder = {
    "sellerBillingAgreementId",
    "storeName",
    "customInformation"
})
public class SellerBillingAgreementAttributes {

    @XmlElement(name = "SellerBillingAgreementId")
    protected String sellerBillingAgreementId;
    @XmlElement(name = "StoreName")
    protected String storeName;
    @XmlElement(name = "CustomInformation")
    protected String customInformation;

    public SellerBillingAgreementAttributes() {
        super();
    }

    public String getSellerBillingAgreementId() {
        return sellerBillingAgreementId;
    }


    public String getStoreName() {
        return storeName;
    }

  
    public String getCustomInformation() {
        return customInformation;
    }


 
 
}