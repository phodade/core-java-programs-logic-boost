package Programs;

public class Largest_Element {

	    public static int findLargestElement(int[] arr) {
      
	    	int max = arr[0];

	        // Iterate through the array to find the largest element
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	        }

	        return max;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] array = { 5, 7, 2, 8};
	        int largestElement = findLargestElement(array);
	        System.out.println("The largest element in the array is: " + largestElement);
	    }
	}



