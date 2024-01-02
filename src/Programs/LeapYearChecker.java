package Programs;

public class LeapYearChecker {

	    public static boolean isLeapYear(int year) {
	        // Leap year if it is divisible by 4
	        // Exception: If the year is divisible by 100, it must also be divisible by 400
	        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int year = 2024;
	        if (isLeapYear(year)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }
	    }
	}

