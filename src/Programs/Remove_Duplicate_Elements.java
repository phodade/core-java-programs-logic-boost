package Programs;
import java.util.Arrays;
import java.util.HashSet;

public class Remove_Duplicate_Elements {

	    public static int[] removeDuplicates(int[] arr) {
	        // Check if the array is not empty
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array is empty or null");
	        }

	        // Use a HashSet to store unique elements
	        HashSet<Integer> uniqueSet = new HashSet<>();

	        // Remove duplicates and maintain the order
	        int index = 0;
	        for (int num : arr) {
	            if (uniqueSet.add(num)) {
	                arr[index++] = num;
	            }
	        }

	        // Create a new array with unique elements
	        int[] result = Arrays.copyOf(arr, index);
	        return result;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {10, 5, 7, 2, 8, 5, 10};
	        System.out.println("Original array: " + Arrays.toString(array));

	        // Remove duplicates
	        int[] arrayWithoutDuplicates = removeDuplicates(array);

	        System.out.println("Array after removing duplicates: " + Arrays.toString(arrayWithoutDuplicates));
	    }
	}

