package que7;

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class DogTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	 @Test
	    public void testSetNameAndGetBreed() {
	        String expectedName = "Max";
	        String expectedBreed = "Labrador";
	        Dog dog = new Dog("", ""); // Creating a dog instance with empty strings
	        dog.setName(expectedName);
	        dog.setBreed(expectedBreed);
	        assertEquals(expectedName, dog.getName());
	        assertEquals(expectedBreed, dog.getBreed());
	}

}
