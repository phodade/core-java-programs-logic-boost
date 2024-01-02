package Programs;

public class Armstrong_Number {

	    public static boolean isArmstrongNumber(int num)
	    {
	        int original = num;
	        int sum = 0;
	        int numberOfDigits = countDigits(num);

	        while (num != 0) 
	        {
	            int digit = num % 10;
	            sum += Math.pow(digit, numberOfDigits);
	            num /= 10;
	        }

	        return sum == original;
	    }

	    public static int countDigits(int num) 
	    {
	        int count = 0;
	        while (num != 0) 
	        {
	            num /= 10;
	            count++;
	        }
	        return count;
	    }

	    public static void main(String[] args)
	    {
	        // Example usage
	        int number = 153;
	        if (isArmstrongNumber(number)) 
	        {
	            System.out.println(number + " is an Armstrong number.");
	        }
	        else 
	        {
	        	
	            System.out.println(number + " is not an Armstrong number.");
	        }
	    }
	}


