package Programs;

public class Calculate_Average_Set_Numbers {

	    public static double calculateAverage(int[] numbers)
	    {
	        // Check if the array is not empty
	        if (numbers == null || numbers.length == 0) 
	        {
	            throw new IllegalArgumentException("Array is empty or null");
	        }

	        int sum = 0;

	        // Calculate the sum of the numbers
	        for (int num : numbers)
	        {
	            sum += num;
	        }

	        // Calculate the average
	        return (double) sum / numbers.length;
	    }

	    public static void main(String[] args) 
	    {
	        // Example usage
	        int[] numbers = {10, 5, 7, 2, 8};
	        double average = calculateAverage(numbers);
	        System.out.println("The average of the numbers is: " + average);
	    }
	}

