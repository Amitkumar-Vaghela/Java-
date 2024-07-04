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


// Exponential Time Complexity : O(2^n)	    
	    public static int exponentialTime_recursiveFibonacci(int n) {
	        if (n < 2) {
	            return n;
	        }
	        return exponentialTime_recursiveFibonacci(n - 1) + exponentialTime_recursiveFibonacci(n - 2);
	    }
	    

// Linearithmic Time Complexity (O(n log n)):	    
	    
	public static void mergeSort(int[] arr, int low, int high) {
		    
	    	    if (low < high) 
         {	                                         // Find the middle point
	    	    int mid = (low + high) / 2;
	    	                                         // Sort first and second halves
	    	    mergeSort(arr, low, mid);
	    	    mergeSort(arr, mid + 1, high);
	    	                                          // Merge the sorted halves
	    	    merge(arr, low, mid, high);
	    	  }
	    	}
	    	public static void merge(int[] arr, int low, int mid, int high) {
	    	                                  // Find sizes of two subarrays to be merged
	    	  int n1 = mid - low + 1;
	    	  int n2 = high - mid;
	    	                                 // Create temp arrays
	    	  int[] L = new int[n1];
	    	  int[] R = new int[n2];
	    	                                  // Copy data to temp arrays
	    	  for (int i = 0; i < n1; i++)
	    	    L[i] = arr[low + i];
	    	  for (int j = 0; j < n2; j++)
	    	    R[j] = arr[mid + 1 + j];
	    	                                // Merge the temp arrays
	    	                               // Initial indexes of first and second subarrays
	    	  int i = 0, j = 0;
	    	                               // Initial index of merged subarray
	    	  int k = low;
	    	  while (i < n1 && j < n2) {
	    	    if (L[i] <= R[j]) {
	    	      arr[k] = L[i];
	    	      i++;
	    	    } else {
	    	      arr[k] = R[j];
	    	      j++;
	    	    }
	    	    k++;
	    	  }
	    	                            // Copy remaining elements of L[] if any
	    	  while (i < n1) {
	    	    arr[k] = L[i];
	    	    i++;
	    	    k++;
	    	  }
	    	                           // Copy remaining elements of R[] if any
	    	  while (j < n2) {
	    	    arr[k] = R[j];
	    	    j++;
	    	    k++;
	    	  }
	    	}

