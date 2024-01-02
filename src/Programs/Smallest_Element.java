package Programs;

public class Smallest_Element {

	    public static int findSmallestElement(int[] arr) {
	        // Check if the array is not empty
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array is empty or null");
	        }

	        int min = arr[0];

	        // Iterate through the array to find the smallest element
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }

	        return min;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {10, 5, 7, 2, 8};
	        int smallestElement = findSmallestElement(array);
	        System.out.println("The smallest element in the array is: " + smallestElement);
	    }
	}

