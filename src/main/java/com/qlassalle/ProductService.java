package com.qlassalle;

import java.util.List;

public class ProductService {

    private List<Product> products = List.of(
            new Product(1, "Foot ball", 10.41f),
            new Product(2, "Bike", 799f),
            new Product(3, "T-Shirt", 12f),
            new Product(4, "Shoes", 39.21f),
            new Product(5, "Skateboard", 29.99f),
            new Product(6, "Electric bike", 1899.49f)
    );

    public void addProduct(int id, String name, float price) {
        var product = new Product(id, name, price);
        products.add(product);
    }

    public Product getProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }

        return null;
    }

    public void sendProductToEcommerceAndSendEmailToClient(int id) {
        var product = getProductById(id);
        sendProductToEcommerce(product);
        sendMessageToDecreaseStockToStockTeam(product);
    }

    private void sendProductToEcommerce(Product product) {
        System.out.printf("Sending product %d to ecommerce...", product.getId());
    }

    private void sendMessageToDecreaseStockToStockTeam(Product product) {
        System.out.printf("Sending message to decrease stock...", product.getId());
    }
}
