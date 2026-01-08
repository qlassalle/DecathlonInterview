package com.qlassalle;

public class EcommerceService {

    public void sendProductToEcommerce(Product product) {
        /*
         TODO
         We want to send a message to the ecommerce team via a message broker
         We need to provide and implement this message broker dependency in a testable way
         */
        System.out.printf("Sending product %d to ecommerce...", product.getId());
    }

    public void sendMessageToIncreaseStockToStockTeam(Product product) {
        /*
          TODO
          We want to send a message to the stock team via a message broker
          We need to provide and implement this message broker dependency in a testable way
         */
        System.out.printf("Sending message to decrease stock for product %d...", product.getId());
    }
}
