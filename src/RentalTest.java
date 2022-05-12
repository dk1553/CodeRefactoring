import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    private Movie testMovie = new Movie( "Frozen", 7);
    private Rental testRental = new Rental(testMovie, 3);

    @Test
    public void testGetMovie() {
        assertEquals(testMovie, testRental.getMovie());
    }

    @Test
    public void testGetDaysRented(){
        assertEquals(3, testRental.getDaysRented());
    }
}