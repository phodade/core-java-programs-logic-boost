package Programs;

public class Calculate_Factorial {

	    public static int calculateFactorial(int n) 
	    {
	        if (n < 0) 
	        {
	            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
	        }

	        if (n == 0 || n == 1) 
	        {
	            return 1;
	        }

	        int factorial = 1;
	        for (int i = 2; i <= n; i++) 
	        {
	            factorial *= i;
	        }

	        return factorial;
	    }

	    public static void main(String[] args)
	    {
	        // Example usage
	        int number = 5;
	        int factorialResult = calculateFactorial(number);
	        System.out.println("The factorial of " + number + " is: " + factorialResult);
	    }
	}

