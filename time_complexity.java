package algorithams;

import java.util.Arrays;


public class Big_O_TimeComplexityDemo {

// Constant Time Complexity (O(1)):	
	  public static int constantTime_firstElement(int[] array) {
	        return array[0];
	    }

	  
// Linear Time Complexity (O(n)):	  
	  public static int linearTime_firstElement(int[] array) {
	        for (int i = 0; i < array.length;) {
	            return array[0];
	        }
	        return -1; // This line is unreachable in this example but added for completeness
	    }
	  
	    public static int linearTime_calcFactorial(int n) {
	        int factorial = 1;
	        for (int i = 2; i <= n; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }


