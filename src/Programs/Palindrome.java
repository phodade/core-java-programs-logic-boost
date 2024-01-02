package Programs;

public class Palindrome {

	    public static boolean isPalindrome(String str) {
	        str = str.toLowerCase();
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
	        String palindromeString = "level";
	        if (isPalindrome(palindromeString)) {
	            System.out.println("\"" + palindromeString + "\" is a palindrome.");
	        } else {
	            System.out.println("\"" + palindromeString + "\" is not a palindrome.");
	        }
	    }
	}

