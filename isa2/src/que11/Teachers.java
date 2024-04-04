package que11;
//velda 237
import java.util.Scanner;

public class Teachers {
	 protected String type;

	    // Method
	    public void Teaches() {
	        System.out.println("This teacher teaches " + type);
	    }
	}

	// Subclass
	class TeacherTeaches extends Teachers {
	    // New member variable
	    String name;

	    // Method
	    public void Subjects() {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the subject taught by the teacher: ");
	        String subject = scanner.nextLine();
	        scanner.close();
	        System.out.println("The teacher is teaching " + subject);
	    }

}
