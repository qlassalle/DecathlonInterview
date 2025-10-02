package com.qlassalle;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

    ProductService productService = new ProductService();

    @Test
    void shouldGetProductByItsId() {
        var expected = new Product(1, "Foot ball", 10.41f);
        var product = productService.getProductById(1);

        assertEquals(expected, product);
    }

    @Test
    void shouldAddAProduct() {
        productService.addProduct(7, "Foot ball", 10.41f);

        assertEquals(7, productService.getProducts().size());
    }

    // TODO how to improve the get by?
    // TODO how to handle duplicates?
    // TODO how to manage an auto increment?
}
