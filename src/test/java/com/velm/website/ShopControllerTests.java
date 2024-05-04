package com.velm.website;

import org.junit.jupiter.api.Test;
import java.util.HashMap;
import java.util.Map;

//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestParam;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopControllerTests {

    private Map<String, String> products = new HashMap<String, String>() {{
        put("Classic Sweatpants", "$30.00");
        put("Sweater", "$49.99");
        put("Women's Shorts", "$19.99");
        put("shirt", "$14.99");
    }};

    @Test
    void testSearch() {
        // Success Test query
        String query = "shirt";

        // Fail Test query
        //String query = "khakis";

        // Test model (replace with a mock or a stub)
        Map<String, Object> model = new HashMap<>();

        // Expected search results
        Map<String, String> expectedProducts = new HashMap<>();
        expectedProducts.put("shirt", "$14.99");

        // Perform the search
        String result = search(query, model);

        // Verify the search results
        assertEquals(expectedProducts, model.get("foundProducts"), "The search results do not match the expected results.");

        // Verify the search page
        assertEquals("search", result, "The search page does not match the expected page.");
    }

    public String search(String query, Map<String, Object> model) {
        Map<String, String> foundProducts = new HashMap<>();
        for (Map.Entry<String, String> entry : products.entrySet()) {
            if (entry.getKey().toLowerCase().contains(query.toLowerCase())) {
                foundProducts.put(entry.getKey(), entry.getValue());
            }
        }
        model.put("foundProducts", foundProducts);
        System.out.println("Search query: " + query);

        // Return the search page showing the search results
        return "search";
    }
}
