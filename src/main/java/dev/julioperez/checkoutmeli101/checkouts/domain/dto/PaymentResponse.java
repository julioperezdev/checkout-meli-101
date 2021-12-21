package dev.julioperez.checkoutmeli101.checkouts.domain.dto;

public class PaymentResponse {

    private Long paymentId;
    private Float unitPrice;
    private String dateCreation;
    private String status;
    private String paymentTypeId;
    private String currencyId;
    private Boolean binaryMode;
    private String payerId;
    private String payerType;
    private String payerEmail;
    private String feeType;
    private Float feeAmount;
    private String feePayer;

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

    public String getPayerId() {
        return payerId;
    }

    public void setPayerId(String payerId) {
        this.payerId = payerId;
    }

    public String getPayerType() {
        return payerType;
    }

    public void setPayerType(String payerType) {
        this.payerType = payerType;
    }

    public String getPayerEmail() {
        return payerEmail;
    }

    public void setPayerEmail(String payerEmail) {
        this.payerEmail = payerEmail;
    }

    public String getFeeType() {
        return feeType;
    }

    public void setFeeType(String feeType) {
        this.feeType = feeType;
    }

    public Float getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(Float feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeePayer() {
        return feePayer;
    }

    public void setFeePayer(String feePayer) {
        this.feePayer = feePayer;
    }
}
