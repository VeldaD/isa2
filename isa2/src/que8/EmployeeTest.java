package que8;
//velda 237

import static org.junit.Assert.*;
import org.junit.Test;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class EmployeeTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	 @Test
	    public void testCalculateTotalSalaryWithDA() {
	    String name = "Asher";
	    String jobTitle = "Software Engineer";
	    double basicSalary = 50000;
	    Employee emp = new Employee(name, jobTitle, basicSalary);

		 // Assuming DA is 10% of the basic salary
	    double expectedDA = 0.10 * basicSalary;
	    double HRA = 5000;
	    double expectedTotalSalary = basicSalary + expectedDA + HRA;

		 assertEquals(expectedTotalSalary, emp.calculateTotalSalary(), 0.01); 
			    
	}

}
