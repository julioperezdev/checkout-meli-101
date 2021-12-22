package dev.julioperez.checkoutmeli101.checkouts.domain.model;

public class Payment {

    private Long paymentId;
    private Float unitPrice;
    private String dateCreation;
    private String status;
    private String paymentTypeId;
    private String currencyId;
    private Boolean binaryMode;

    public Payment(Long paymentId, Float unitPrice, String dateCreation, String status, String paymentTypeId, String currencyId, Boolean binaryMode) {
        this.paymentId = paymentId;
        this.unitPrice = unitPrice;
        this.dateCreation = dateCreation;
        this.status = status;
        this.paymentTypeId = paymentTypeId;
        this.currencyId = currencyId;
        this.binaryMode = binaryMode;
    }

    public Long getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(Long paymentId) {
        this.paymentId = paymentId;
    }

    public Float getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Float unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(String dateCreation) {
        this.dateCreation = dateCreation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentTypeId() {
        return paymentTypeId;
    }

    public void setPaymentTypeId(String paymentTypeId) {
        this.paymentTypeId = paymentTypeId;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Boolean getBinaryMode() {
        return binaryMode;
    }

    public void setBinaryMode(Boolean binaryMode) {
        this.binaryMode = binaryMode;
    }
}
