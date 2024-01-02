package Programs;

public class PowerCalculator {

	    public static double calculatePower(double base, int exponent) {
	        // Check if the exponent is non-negative
	        if (exponent < 0) {
	            throw new IllegalArgumentException("Exponent must be non-negative");
	        }

	        double result = 1;

	        // Calculate power using a loop
	        for (int i = 0; i < exponent; i++) {
	            result *= base;
	        }

	        return result;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        double base = 2;
	        int exponent = 3;
	        double powerResult = calculatePower(base, exponent);
	        System.out.println(base + " raised to the power of " + exponent + " is: " + powerResult);
	    }
	}

