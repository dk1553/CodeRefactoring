package tests;

import classes.Movie;
import org.junit.Assert;
import org.junit.Test;



import static org.junit.Assert.*;

public class MovieTest {


        private Movie testMovie= new Movie("Shrek", Movie.REGULAR);

        @Test
        public void testGetMovie(){
                Assert.assertEquals("Shrek",testMovie.getTitle());
        }

        @Test
        public void testGetPrice(){
                Assert.assertEquals(4, testMovie.getCharge(3));
        }

        @Test
        public void testSetPriceCode(){
                testMovie.setPrice(Movie.REGULAR);
                Assert.assertEquals(4, testMovie.getCharge(3));
        }

}
