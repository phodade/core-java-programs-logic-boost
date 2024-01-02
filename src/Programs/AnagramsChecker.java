package Programs;
import java.util.Arrays; 

public class AnagramsChecker {

 public static boolean areAnagrams(String str1, String str2)
 {
	        // Check if both strings are not null
	        if (str1 == null || str2 == null)
	        {
	            throw new IllegalArgumentException("Both strings must not be null");
	        }

	        // Remove spaces and convert to lowercase for case-insensitive comparison
	        str1 = str1.replaceAll("\\s", "").toLowerCase();
	        str2 = str2.replaceAll("\\s", "").toLowerCase();

	        // Check if the lengths are the same after removing spaces
	        if (str1.length() != str2.length()) 
	        {
	            return false;
	        }

	        // Convert strings to character arrays and sort them
	        char[] charArray1 = str1.toCharArray();
	        char[] charArray2 = str2.toCharArray();
	        Arrays.sort(charArray1);
	        Arrays.sort(charArray2);

	        // Compare the sorted character arrays
	        return Arrays.equals(charArray1, charArray2);
	    }

	    public static void main(String[] args)
	    {
	        // Example usage
	        String string1 = "Listen";
	        String string2 = "Silent";

	        if (areAnagrams(string1, string2)) 
	        {
	            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are anagrams.");
	        } else {
	            System.out.println("\"" + string1 + "\" and \"" + string2 + "\" are not anagrams.");
	        }
	    }
	}

