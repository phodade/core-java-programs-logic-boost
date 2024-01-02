package Programs;

public class Generate_Fibonacci_Series {

	    public static void generateFibonacciSeries(int n) {
	        int a = 0, b = 1;

	        System.out.print("Fibonacci Series up to " + n + " terms: ");
	        System.out.print(a + " " + b + " ");

	        for (int i = 2; i < n; i++) {
	            int next = a + b;
	            System.out.print(next + " ");
	            a = b;
	            b = next;
	        }
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int terms = 10; // Change this value to generate a different number of terms
	        generateFibonacciSeries(terms);
	    }
	}

