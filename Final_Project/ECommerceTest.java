package Final_Project; // Folder in which my file is located

import java.util.*; // Import the entire java util library

import static org.junit.Assert.assertEquals; // Import junit assertEquals method as static
import org.junit.Test; // Import Junit Test

import Final_Project.ECommerce; // Import the main ECommerce java file

public class ECommerceTest { // Initialize class named ECommerceTest

    // @Test
    // public void testAddProduct() {}  // NOTE: I don't think you can test a non-return method like in the ECommerce.addProduct() separately

    @Test
    public void testApplyDiscount(){ // Create a Test method for the return method ECommerce.applyDiscount()
        ECommerce eCommerce = new ECommerce();
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
