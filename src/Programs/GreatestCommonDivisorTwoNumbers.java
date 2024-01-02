package Programs;

public class GreatestCommonDivisorTwoNumbers {

	    public static int findGCD(int a, int b) {
	        // Ensure that both numbers are non-negative
	        if (a < 0 || b < 0) {
	            throw new IllegalArgumentException("Both numbers must be non-negative");
	        }

	        // Apply the Euclidean Algorithm to find the GCD
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }

	        return a;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int num1 = 24;
	        int num2 = 36;
	        int gcdResult = findGCD(num1, num2);
	        System.out.println("The GCD of " + num1 + " and " + num2 + " is: " + gcdResult);
	    }
	}

