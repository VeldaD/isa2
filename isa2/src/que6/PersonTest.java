package que6;
//velda 237

import static org.junit.Assert.*;
import org.junit.Test;


import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class PersonTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}


@Test
    public void testGetterMethodsWithDifferentData() {
        String expectedName = "Noela";
        int expectedAge = 21;
        Person person = new Person(expectedName, expectedAge);
        assertEquals(expectedName, person.getName());
        assertEquals(expectedAge, person.getAge());
	}

}
