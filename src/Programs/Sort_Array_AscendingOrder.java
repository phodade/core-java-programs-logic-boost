package Programs;
import java.util.Arrays;

public class Sort_Array_AscendingOrder 
{

	    public static void sortArray(int[] arr) {
	        // Check if the array is not empty
	        if (arr == null || arr.length == 0) {
	            throw new IllegalArgumentException("Array is empty or null");
	        }

	        // Sort the array in ascending order
	        Arrays.sort(arr);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int[] array = {10, 5, 7, 2, 8};
	        System.out.println("Before sorting: " + Arrays.toString(array));

	        // Sort the array
	        sortArray(array);

	        System.out.println("After sorting: " + Arrays.toString(array));
	    }
	}

