package Programs;

public class Count_Vowels_Consonants 
{
      public static void countVowelsAndConsonants(String str) {
	        int vowels = 0, consonants = 0;
	        str = str.toLowerCase();

	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);

	            if (ch >= 'a' && ch <= 'z') {
	                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                    vowels++;
	                } else {
	                    consonants++;
	                }
	            }
	        }

	        System.out.println("Vowels: " + vowels);
	        System.out.println("Consonants: " + consonants);
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String inputString = "Hello World";
	        countVowelsAndConsonants(inputString);
	    }
	}


