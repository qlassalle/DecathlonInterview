package com.qlassalle;

public class EcommerceService {

    public void sendProductToEcommerce(Product product) {
        /*
         TODO
         We want to send a message to the ecommerce team via a message broker.
         In preproduction, our message solution is RabbitMQ, while in production it's Kafka. Design a solution that
         will allow this requirement.

         The expected final code for this method is this:

         messageService.send("ecommerce-channel", product);
         */
    }

    public void sendMessageToIncreaseStockToStockTeam(Product product) {
        /*
          TODO
          We want to send a message to the stock team via a message broker
          In preproduction, our message solution is RabbitMQ, while in production it's Kafka. Design a solution that
          will allow this requirement.

          The expected final code for this method is this:

          messageService.send("ecommerce-channel", product);
         */
    }
}
