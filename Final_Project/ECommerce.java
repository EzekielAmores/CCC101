package Final_Project; // Folder in which my file is located

import java.util.*; // Import the entire java util library

public class ECommerce { // Initialize class named ECommerce
    public Map<String, Integer> inventory = new HashMap<>(); // Initialize invertory map/hashmap as public so that it is accessable when testing
    public Map<String, Double> prices = new HashMap(); // Initialize price map/hashmap as public so that it is accessable when testing

    public void addProduct (String name, int quantity, double price) { // Create a non-return method for adding product
        inventory.put(name, quantity); // Stores a data in the inverntory map with key of name and value of quantity
        prices.put(name, price); // Stored a data in the prices map with key of name and value of price
    }

    public boolean applyDiscount(String product, double discountPercent){ // Create return method for applying discount
        //Check if discount percent is between 0.0 to 1.0
        if (discountPercent < 0.0 || discountPercent > 1.0) return false; // If discountPercent is above 1.0 or below 0.0, return -1

        // Find product to apply discount 
        for (Map.Entry<String, Double> e : prices.entrySet()){ // For loop checking each entry of the map named prices as denoted by the letter e
            // Apply discount
            if (e.getKey().equals(product)){ // Check if the product name is found in the prices map
                e.setValue(e.getValue() - (e.getValue() * discountPercent)); // set found product price in prices map 
                return true; // return set price
            }
        }

        return false; // If no product found, return -1
    }

    public int checkStock(String product){ // Create return method for checking stocks
        // Find the product
        for (Map.Entry<String, Integer> e : inventory.entrySet()){ // For loop checking each entry of the map named inventory as denoted by the letter e
            if (e.getKey().equals(product)){ // Check if the product name is found in the inventory map
                // Display quantity
                return e.getValue(); // return the quantity of the found product
            }
        }
        return -1; // If no product found, return -1
    }
}
