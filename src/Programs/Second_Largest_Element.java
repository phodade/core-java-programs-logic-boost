package Programs;

public class Second_Largest_Element {

	    public static int findSecondLargest(int[] arr) {
	        // Check if the array has at least two elements
	        if (arr == null || arr.length < 2) {
	            throw new IllegalArgumentException("Array must have at least two elements");
	        }

	        int first = Integer.MIN_VALUE;
	        int second = Integer.MIN_VALUE;

	        // Iterate through the array to find the second largest element
	        for (int num : arr) {
	            if (num > first) {
	                second = first;
	                first = num;
	            } else if (num > second && num != first) {
	                second = num;
	            }
	        }

	        // If there is no second largest element, return an error value
	        if (second == Integer.MIN_VALUE) {
	            throw new IllegalArgumentException("Array does not have a second largest element");
	        }

	        return second;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {10, 5, 7, 2, 8};
	        int secondLargestElement = findSecondLargest(array);
	        System.out.println("The second largest element in the array is: " + secondLargestElement);
	    }
	}

