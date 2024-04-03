package que4;

import static org.junit.Assert.*;
import org.junit.After;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CountDigitsTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
    public void testCountDigitsPositiveNumber() {
        int num = 91203;
        int expectedResult = 5;
        int actualResult = CountDigits.countDigits(num);
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testCountDigitsNegativeNumber() {
        int num = -12345;
        int expectedResult = 5;
        int actualResult = CountDigits.countDigits(num);
        assertEquals(expectedResult, actualResult);
	}

}
