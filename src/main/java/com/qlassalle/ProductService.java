package com.qlassalle;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> products = new ArrayList<>();
    public EcommerceService ecommerceService = new EcommerceService();

    static {{
        products.add(new Product(1, "Foot ball", 10.41f));
        products.add(new Product(2, "Bike", 799f));
        products.add(new Product(3, "T-Shirt", 12f));
        products.add(new Product(4, "Shoes", 39.21f));
        products.add(new Product(5, "Skateboard", 29.99f));
        products.add(new Product(6, "Electric bike", 1899.49f));
    }}

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(int id, String name, float price) {
        var product = new Product(id, name, price);
        products.add(product);
        sendProductToEcommerceAndSendEmailToClient(product.getId());
    }

    public Product getProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }

        return null;
    }

    /**
     * Returns the k most expensive products in the catalog.
     *
     * @param k the number of products to return
     * @return a list of the k most expensive products, sorted from most to least expensive
     *
     * TODO: Implement this method. Consider edge cases (e.g., k > number of products, k <= 0),
     * immutability of the returned list, and clean code best practices.
     *
     * Discussion points:
     * - Should this return an immutable list?
     * - How to handle ties in price?
     * - What should happen if k is invalid?
     * - What is the algorithmic complexity?
     */
    public List<Product> getKMostExpensiveProducts(int k) {
        // TODO 1: implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO 2: implement a method to get the average price of products in the catalog

    // TODO 3: how to test this? Implement these methods in the ecommerce service where it should be saved in message
    //  queues provided by some interface
    public void sendProductToEcommerceAndSendEmailToClient(int id) {
        var product = getProductById(id);
        ecommerceService.sendProductToEcommerce(product);
        ecommerceService.sendMessageToDecreaseStockToStockTeam(product);
    }

    // TODO 4: Implement an undo/redo mechanism for product modification
}
