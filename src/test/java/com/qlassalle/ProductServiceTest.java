package com.qlassalle;


import org.junit.jupiter.api.Test;

import java.util.List;

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
        productService.addProduct(7, "Basket ball", 7.69f);

        assertEquals(7, productService.getProducts()
                                      .size());
    }

    @Test
    void getKMostExpensiveProducts_shouldReturnMostExpensive() {
        ProductService service = new ProductService();
        var result = service.getMostExpensiveProducts(3);
        List<Integer> expected = List.of(6, 2, 4);
        assertEquals(expected, result.stream()
                                     .map(Product::getId)
                                     .toList());
    }
    /**
     * Edge cases for top K
     *      - k <= 0
     *      - k >= products size
     */


    /**
     * More open questions:
     * TODO how to improve the get by?
     * TODO how to handle duplicates in our list of products?
     * TODO how to manage an auto increment on product IDs?
     **/
}
