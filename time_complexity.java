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
	    
//Logarithm Time Complexity O(log n): 	    
	    public static int linearTime_binarySearch(int[] array, int target) {
	        int firstIndex = 0;
	        int lastIndex = array.length - 1;

	        while (firstIndex <= lastIndex) {
	            int middleIndex = (firstIndex + lastIndex) / 2;

	            if (array[middleIndex] == target) {
	                return middleIndex;
	            }

	            if (array[middleIndex] > target) {
	                lastIndex = middleIndex - 1;
	            } else {
	                firstIndex = middleIndex + 1;
	            }
	        }
	        return -1;
	    }
	    
	    
// Quadratic Time Complexity  O(n^2) :	    
	    public static String quadraticTime_matchElements(char[] array) {
	        for (int i = 0; i < array.length; i++) {
	            for (int j = 0; j < array.length; j++) {
	                if (i != j && array[i] == array[j]) {
	                    return "Match found at " + i + " and " + j;
	                }
	            }
	        }
	        return "No matches found";
	    }


