package Programs;

public class Number_Prime {

	    public static boolean isPrime(int num) {
	        if (num <= 1) {
	            return false;
	        }

	        // Check for factors from 2 to the square root of the number
	        for (int i = 2; i <= Math.sqrt(num); i++) {
	            if (num % i == 0) {
	                return false; // If a factor is found, the number is not prime
	            }
	        }

	        return true; // If no factor is found, the number is prime
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int number = 17;
	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }
	}

