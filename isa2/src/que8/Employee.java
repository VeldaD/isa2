package que8;

public class Employee {
	  private String name;
	    private String jobTitle;
	    private double basicSalary;

	    public Employee(String name, String jobTitle, double basicSalary) {
	        this.name = name;
	        this.jobTitle = jobTitle;
	        this.basicSalary = basicSalary;
	    }

	    public double calculateTotalSalary() {
	        double DA = 0.10 * basicSalary; 
	        double HRA = 5000;
	        return basicSalary + DA + HRA;
	    }

	    public void updateSalary(double newSalary) {
	        this.basicSalary = newSalary;
	    }

	    public static void main(String[] args) {

	        Employee emp = new Employee("Asher", "Software Engineer", 50000);
	        System.out.println("Initial Total Salary of " + emp.name + ": " + emp.calculateTotalSalary());

	        emp.updateSalary(55000);
	        System.out.println("Updated Total Salary of " + emp.name + ": " + emp.calculateTotalSalary());
	    }	
}
