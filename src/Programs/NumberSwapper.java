package Programs;

public class NumberSwapper {

	    public static void swapNumbers(int a, int b) {
	        System.out.println("Before swap: a = " + a + ", b = " + b);

	        // Swapping without a temporary variable
	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swap: a = " + a + ", b = " + b);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int num1 = 5;
	        int num2 = 10;
	        swapNumbers(num1, num2);
	    }
	}

