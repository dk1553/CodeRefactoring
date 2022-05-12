package tests;

import classes.Movie;
import classes.Rental;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    private Movie testMovie = new Movie( "Frozen", Movie.CHILDRENS);
    private Rental testRental = new Rental(testMovie, 3);

    @Test
    public void testGetMovie() {
        Assert.assertEquals(testMovie, testRental.getMovie());
    }

    @Test
    public void testGetDaysRented(){
        Assert.assertEquals(3, testRental.getDaysRented());
    }
}