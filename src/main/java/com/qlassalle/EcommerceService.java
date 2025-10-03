package com.qlassalle;

public class EcommerceService {

    public void sendProductToEcommerce(Product product) {
        System.out.printf("Sending product %d to ecommerce...", product.getId());
    }

    public void sendMessageToDecreaseStockToStockTeam(Product product) {
        System.out.printf("Sending message to decrease stock for product %d...", product.getId());
    }
}
