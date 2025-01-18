package com.packt.webstore.exception;

public class ProductNotFoundException extends RuntimeException {
    private static final long serialVersionUID = -694354952032399587L;
    private String productId;

    public ProductNotFoundException(String productId) {
        this.productId = productId;
    }

    public String getProductId() {
        return productId;
    }
}
