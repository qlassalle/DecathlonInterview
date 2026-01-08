package com.qlassalle;

public class EcommerceService {

    public void sendProductToEcommerce(Product product) {
        /*
         TODO
         We want to send a message to the ecommerce team via a message broker
         Implement the business logic using the correct abstraction and test it without using Mockito for the tests
        */

         // For example, we'd like to interact with our message broker in this way:
         // messageService.send("ecommerce-channel", product);
    }

    public void sendMessageToIncreaseStockToStockTeam(Product product) {
        /*
          TODO
          We want to send a message to the stock team via a message broker
          Implement the business logic using the correct abstraction and test it without using Mockito for the tests
         */

          // For example, we'd like to interact with our message broker in this way:
          // messageService.send("stock-channel", product);
    }
}
