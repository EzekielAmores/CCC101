package Final_Project; // Folder in which my file is located

import java.util.HashMap; // Import hashmap class
import java.util.Map; // Import map class

import static org.junit.Assert.assertEquals; // Import junit assertEquals method as static
import org.junit.Test; // Import Junit Test

public class ECommerce { // Initialize class named ECommerce
    private Map<String, Integer> inventory = new HashMap<>(); // Initialize invertory map/hashmap
    private Map<String, Double> prices = new HashMap(); // Initialize price map/hashmap

    public void addProduct (String name, int quantity, double price) { // Create method for adding product
        inventory.put(name, quantity); // Stores a data in the inverntory map with key of name and value of quantity
        prices.put(name, price); // Stored a data in the prices map with key of name and value of price
    }

    // TODO add applyDiscount method
    public double applyDiscount(String product, double discountPercent){ // Create return method for applying discount
        //Check if discount percent is between 0.0 to 1.0
        if (discountPercent < 0.0 || discountPercent > 1.0) return -1; // If discountPercent is above 1.0 or below 0.0, return -1

        // Find product to apply discount 
        for (Map.Entry<String, Double> e : prices.entrySet()){ // For loop checking each entry of the map named prices as denoted by the letter e
            // Apply discount
            if (e.getKey().equals(product)){ // Check if the product name is found in the prices map
                e.setValue(e.getValue() - (e.getValue() * discountPercent)); // set found product price in prices map 
                return e.getValue(); // return set price
            }
        }

        return -1; // If no product found, return -1
    }

    // TODO add checkStock method
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

    @Test // Declaration that this method is a test method
    public void test(){ // Create a test method
        addProduct("Notebook", 20, 30); // Initialize a test product named Notebook, quantity of 20, and price of 30
        addProduct("Pen", 50, 10); // Initialize a test product named Pen, quantity of 50, and price of 10

        assertEquals(15, applyDiscount("Notebook", 0.5), 0.0); // Check if the return value of the product named Notebook with a discount percentage of 50% matched the expected value
        assertEquals(50, checkStock("Pen")); // Check if the return value of the product named Pen with set quantity matches the expected value

        assertEquals(-1, applyDiscount("Notebook", 1.1), 0.0); // Assume the discount is 110 percent which is not possible, so a return value of -1 is expected
        assertEquals(-1, applyDiscount("Pen", -0.1), 0.0); // Assume the discount is -10 percent which is not possible, so a return value of -1 is expected
        
        assertEquals(-1, applyDiscount("Book", 0.30), 0.0); // A return value that expects a value of -1
        assertEquals(-1, checkStock("Ballpen")); // A return value that expects a value of -1

    }
    
}
