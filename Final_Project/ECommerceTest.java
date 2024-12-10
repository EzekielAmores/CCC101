package Final_Project; // Folder in which my file is located

import java.util.*; // Import the entire java util library

import static org.junit.Assert.*; // Import junit assertEquals method as static
import org.junit.Test; // Import Junit Test
import static org.hamcrest.CoreMatchers.is; // Import is method 

import Final_Project.ECommerce; // Import the main ECommerce java file

public class ECommerceTest { // Initialize class named ECommerceTest

    @SuppressWarnings("deprecation") // Annotation for deprecation warnings from assertThat
    @Test
    public void testAddProduct() {
        ECommerce eCommerce = new ECommerce(); // Initialize a new ECommerce object
        eCommerce.addProduct("Notebook", 20, 30); // Initialize a test product named Notebook, quantity of 20, and price of 30
        eCommerce.addProduct("Pen", 50, 10); // Initialize a test product named Pen, quantity of 50, and price of 10

        // Creates an expected Inventory map
        Map<String, Integer> expectedInventory = Map.of
        (
            "Notebook", 20,
            "Pen", 50
        );

        double notebookPrice = 30; // placeholder
        double penPrice = 10; // placeholder

        // Creates an expected Price map
        Map<String, Double> expectedPrice = Map.of
        (
            "Notebook", notebookPrice, 
            "Pen", penPrice
        );

        assertThat(eCommerce.inventory, is(expectedInventory)); // Returns true when the ECommerce inventory matches the expected inventory
        assertThat(eCommerce.prices, is(expectedPrice)); // Returns true when the ECommerce inventory matches the expected inventory

    }

    @Test
    public void testApplyDiscount(){ // Create a Test method for the return method ECommerce.applyDiscount()
        ECommerce eCommerce = new ECommerce(); // Initialize a new ECommerce object
        eCommerce.addProduct("Notebook", 20, 30); // Initialize a test product named Notebook, quantity of 20, and price of 30
        eCommerce.addProduct("Pen", 50, 10); // Initialize a test product named Pen, quantity of 50, and price of 10
        eCommerce.addProduct("Eraser", 30, 15); // Initialize a test product named Eraser, quantity of 30, and price of 15

        assertEquals(true, eCommerce.applyDiscount("Notebook", 0.5)); // Check if the return value of the product named Notebook with a discount percentage of 50% matched the expected value
        assertEquals(false, eCommerce.applyDiscount("Pen", 1.1)); // Assume the discount is 110 percent which is not possible, so a return value of -1 is expected
        assertEquals(false, eCommerce.applyDiscount("Eraser", -0.1)); // Assume the discount is -10 percent which is not possible, so a return value of -1 is expected
    }

    @Test
    public void testCheckStock(){ // Create a Test method for the return method ECommerce.checkStock() 
        ECommerce eCommerce = new ECommerce(); // Initialize a new ECommerce object
        eCommerce.addProduct("Notebook", 20, 30); // Initialize a test product named Notebook, quantity of 20, and price of 30
        eCommerce.addProduct("Pen", 50, 10); // Initialize a test product named Pen, quantity of 50, and price of 10
        eCommerce.addProduct("Eraser", 30, 15); // Initialize a test product named Eraser, quantity of 30, and price of 15

        assertEquals(20, eCommerce.checkStock("Notebook")); // Check if the return value of the product named Notebook with set quantity matches the expected value
        assertEquals(50, eCommerce.checkStock("Pen")); // Check if the return value of the product named Pen with set quantity matches the expected value
        assertEquals(30, eCommerce.checkStock("Eraser")); // Check if the return value of the product named Eraser with set quantity matches the expected value

        assertEquals(-1, eCommerce.checkStock("Ballpen")); // A return value that expects a value of -1
    }
    
}
