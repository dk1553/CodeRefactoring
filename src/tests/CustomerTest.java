package tests;

import classes.Customer;
import classes.Movie;
import classes.Rental;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer testCustomer = new Customer("Daria");

    @Test
    public void testGetName(){
        Assert.assertEquals("Daria", testCustomer.getName());
    }

    @Test
    public void testStatement(){
        Assert.assertEquals("Rental Record for Daria\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "Amount owed is 0\n" +
                "You earned 0 frequent renter points", testCustomer.statement());

        testCustomer.addRental(new Rental(new Movie("Frozen", Movie.REGULAR), 12));
        Assert.assertEquals("Rental Record for Daria\n" +
                "\tTitle\t\tDays\tAmount\n" +
                "\tFrozen\t\t12\t22\n" +
                "Amount owed is 22\n" +
                "You earned 1 frequent renter points", testCustomer.statement());
    }
}