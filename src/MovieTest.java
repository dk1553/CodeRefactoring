import org.junit.Assert;
import org.junit.Test;



import static org.junit.Assert.*;

public class MovieTest {


        private Movie testMovie= new Movie("Shrek", 2);

        @Test
        public void testGetMovie(){
                Assert.assertEquals("Shrek",testMovie.getTitle());
        }

        @Test
        public void testGetPriceCode(){
                Assert.assertEquals(2, testMovie.getPriceCode());
        }


        @Test
        public void testSetPriceCode(){
                testMovie.setPriceCode(20);
                Assert.assertEquals(20, testMovie.getPriceCode());
        }
        }