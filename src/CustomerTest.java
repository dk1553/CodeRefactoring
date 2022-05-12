import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer testCustomer = new Customer("Daria");

    @Test
    public void testGetName(){
        assertEquals("Daria", testCustomer.getName());
    }



    @Test
    public void testStatement(){
        assertEquals("Rental Record for Daria\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", testCustomer.statement());

        testCustomer.addRental(new Rental(new Movie("Frozen", 5), 12));

        assertEquals("Rental Record for Daria\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tFrozen\t\t12\t0.0\n" +
                "Amount owed is 0.0\n" +
                "You earned 1 frequent renter points", testCustomer.statement());
    }

}