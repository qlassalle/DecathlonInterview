package com.qlassalle;

import java.util.ArrayList;
import java.util.List;

public class ProductService {

    private List<Product> products = new ArrayList<>();
    public EcommerceService ecommerceService = new EcommerceService();

    public ProductService() {
        products.add(new Product(1, "Foot ball", 10.41f));
        products.add(new Product(2, "Bike", 799f));
        products.add(new Product(3, "T-Shirt", 12f));
        products.add(new Product(4, "Shoes", 39.21f));
        products.add(new Product(5, "Skateboard", 29.99f));
        products.add(new Product(6, "Electric bike", 1899.49f));
    }

    public List<Product> getProducts() {
        return products;
    }

    public void addProduct(int id, String name, float price) {
        var product = new Product(id, name, price);
        products.add(product);
        sendProductToEcommerceAndStockTeam(product.getId());
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
     * @param numberOfProducts the number of products to return
     * @return a list of the k most expensive products, sorted from most to least expensive
     */
    public List<Product> getMostExpensiveProducts(int numberOfProducts) {
        // TODO 1: implement
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // TODO 2: Create the business logic using stubs (no Mockito) and tests for this method
    public void sendProductToEcommerceAndStockTeam(int id) {
        var product = getProductById(id);
        ecommerceService.sendProductToEcommerce(product);
        ecommerceService.sendMessageToIncreaseStockToStockTeam(product);
    }

    // TODO 3: Implement an undo/redo mechanism for product modification
}
