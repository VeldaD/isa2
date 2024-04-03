package que3;

public class fibinacci {


	    public static int[] generateFibonacciSeries(int n) {
	        if (n <= 0) {
	            return new int[0];
	        }
	        
	        int[] series = new int[n];
	        int firstTerm = 0;
	        int secondTerm = 1;
	        
	        series[0] = firstTerm;
	        if (n > 1) {
	            series[1] = secondTerm;
	        }
	        
	        for (int i = 2; i < n; i++) {
	            int nextTerm = firstTerm + secondTerm;
	            series[i] = nextTerm;
	            firstTerm = secondTerm;
	            secondTerm = nextTerm;
	        }
	        
	        return series;
	}

}
