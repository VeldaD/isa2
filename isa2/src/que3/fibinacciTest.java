package que3;
//velda 237



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class fibinacciTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	   @Test
	    public void testfibinacciSeries() {
	        int n = 10;
	        int[] expectedResult = {0, 1, 1, 2, 3, 5, 8, 13, 21, 34};
	        int[] actualResult = fibinacci.generateFibonacciSeries(n);
	        assertArrayEquals(expectedResult, actualResult);
	    }
	    @Test
	    public void testfibinacciSeriesWithZeroTerms() {
	        int n = 0;
	        int[] expectedResult = {};
	        int[] actualResult = fibinacci.generateFibonacciSeries(n);
	        assertArrayEquals(expectedResult, actualResult);

	}

}
