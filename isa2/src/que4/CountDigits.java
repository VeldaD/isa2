package que4;
import java.util.Scanner;

public class CountDigits {
	



		 public static int countDigits(int num) {
		        int count = 0;
		        
		        // Convert negative number to positive for counting digits
		        if (num < 0) {
		            num = Math.abs(num);
		        }
		        
		        // Count digits
		        while (num != 0) {
		            num /= 10;
		            ++count;
		        }
		        
		        return count;
		}


	}