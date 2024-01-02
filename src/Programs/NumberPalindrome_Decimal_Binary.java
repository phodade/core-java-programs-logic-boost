package Programs;

public class NumberPalindrome_Decimal_Binary {

	public static boolean isDecimalPalindrome(int num) {
	        int original = num;
	        int reversed = 0;

	        while (num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }

	        return original == reversed;
	    }

	    public static boolean isBinaryPalindrome(int num) {
	        String binaryString = Integer.toBinaryString(num);
	        return isStringPalindrome(binaryString);
	    }

	    public static boolean isStringPalindrome(String str) {
	        int left = 0, right = str.length() - 1;

	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }

	        return true;
	    }

	    public static void main(String[] args) {
	        // Example usage
	        int number = 121;
	        
	        if (isDecimalPalindrome(number) && isBinaryPalindrome(number)) {
	            System.out.println(number + " is a palindrome in both decimal and binary representations.");
	        } else {
	            System.out.println(number + " is not a palindrome in both decimal and binary representations.");
	        }
	    }
	}

