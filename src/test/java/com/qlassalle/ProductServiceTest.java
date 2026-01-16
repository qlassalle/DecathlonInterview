package com.qlassalle;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ProductServiceTest {

    ProductService productService;

    @BeforeEach
    void setUp() {
        productService = new ProductService();
    }

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
    void getMostExpensiveProducts_shouldReturnMostExpensive() {
        ProductService service = new ProductService();
        var result = service.getMostExpensiveProducts(3);
        // TODO: Implement assertions once method is implemented
        assertEquals(1, 2);
        // or assertJ style
        // Assertions.assertThat(1).isEqualTo(2);
    }
}
