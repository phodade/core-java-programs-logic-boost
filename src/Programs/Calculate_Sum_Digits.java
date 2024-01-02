package Programs;

public class Calculate_Sum_Digits {

	    public static int calculateSumOfDigits(int num) 
	    {
	        // Ensure the input number is non-negative
	        if (num < 0) 
	        {
	            throw new IllegalArgumentException("Input number must be non-negative");
	        }

	        int sum = 0;

	        // Calculate the sum of digits
	        while (num > 0) 
	        {
	            int digit = num % 10;
	            sum += digit;
	            num /= 10;
	        }

	        return sum;
	    }

	    public static void main(String[] args) 
	    {
	        // Example usage
	        int number = 12345;
	        int sumOfDigits = calculateSumOfDigits(number);
	        System.out.println("The sum of digits in " + number + " is: " + sumOfDigits);
	    }
	}
