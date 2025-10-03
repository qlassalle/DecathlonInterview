package com.qlassalle;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private static List<Product> products = new ArrayList<>();

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
    }

    public Product getProductById(int id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                return products.get(i);
            }
        }

        return null;
    }

    // TODO how to test this?
    public void sendProductToEcommerceAndSendEmailToClient(int id) {
        var product = getProductById(id);
        sendProductToEcommerce(product);
        sendMessageToDecreaseStockToStockTeam(product);
    }

    private void sendProductToEcommerce(Product product) {
        System.out.printf("Sending product %d to ecommerce...", product.getId());
    }

    private void sendMessageToDecreaseStockToStockTeam(Product product) {
        System.out.printf("Sending message to decrease stock for product %d...", product.getId());
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
        // TODO: implement
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
