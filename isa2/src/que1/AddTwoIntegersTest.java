package que1;
//velda 237
import org.junit.Test;


import static org.junit.Assert.assertEquals;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class AddTwoIntegersTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
    public void testAddition() {
        int first = 5;
        int second = 4;
        int expectedResult = 9;
        int actualResult = first + second;
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeNumbers() {
        int first = -2;
        int second = -7;
        int expectedResult = -9;
        int actualResult = first + second;
        assertEquals(expectedResult, actualResult);

	}

}
