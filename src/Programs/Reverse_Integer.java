package Programs;

public class Reverse_Integer {

	    public static int reverseInteger(int num) {
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        return reversed;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int number = 12345;
	        int reversedNumber = reverseInteger(number);
	        System.out.println("Original Number: " + number);
	        System.out.println("Reversed Number: " + reversedNumber);
	    }
	}


