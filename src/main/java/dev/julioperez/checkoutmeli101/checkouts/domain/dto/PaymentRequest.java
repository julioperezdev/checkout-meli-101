package dev.julioperez.checkoutmeli101.checkouts.domain.dto;

import java.util.List;

public class PaymentRequest {

    private Boolean binaryMode;
    private Float applicationFee;
    private String productTitle;
    private String productDescription;
    private String productImageUrl;
    private Integer productQuantity;
    private Float productUnitPrice;
    //maybe can add payer information


    public Boolean getBinaryMode() {
        return binaryMode;
    }

    public void setBinaryMode(Boolean binaryMode) {
        this.binaryMode = binaryMode;
    }

    public Float getApplicationFee() {
        return applicationFee;
    }

    public void setApplicationFee(Float applicationFee) {
        this.applicationFee = applicationFee;
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductImageUrl() {
        return productImageUrl;
    }

    public void setProductImageUrl(String productImageUrl) {
        this.productImageUrl = productImageUrl;
    }

    public Integer getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    public Float getProductUnitPrice() {
        return productUnitPrice;
    }

    public void setProductUnitPrice(Float productUnitPrice) {
        this.productUnitPrice = productUnitPrice;
    }
}
