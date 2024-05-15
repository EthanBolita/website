package com.velm.website;

import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class shoppingCartTests {
    @Test
    void testRemoveProduct() {
          shoppingCart ShoppingCart= new shoppingCart();
        // Arrange: Add products to the shopping cart
        product item1 = new product(19.99, "small", "red", 1);
        product item2 = new product(24.99, "medium", "blue", 1);
        ShoppingCart.addToCart(item1);
        ShoppingCart.addToCart(item2);
        
        // Act: Remove a product
      ShoppingCart.remove(item1);
        
        // Assert: Verify the expected behavior
        assertEquals(24.99, ShoppingCart.getTotal(), 0.001, "Total cost should be updated");
    }
}
