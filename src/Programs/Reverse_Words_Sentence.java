package Programs;

public class Reverse_Words_Sentence {

	    public static String reverseWords(String sentence) {
	        // Check if the sentence is not empty
	        if (sentence == null || sentence.trim().isEmpty()) {
	            throw new IllegalArgumentException("Sentence is empty or null");
	        }

	        // Split the sentence into words
	        String[] words = sentence.split("\\s+");

	        // Reverse the order of words
	        StringBuilder reversedSentence = new StringBuilder();
	        for (int i = words.length - 1; i >= 0; i--) {
	            reversedSentence.append(words[i]).append(" ");
	        }

	        // Remove the trailing space
	        return reversedSentence.toString().trim();
	    }

	    public static void main(String[] args) {
	        // Example usage
	        String inputSentence = "Hello World";
	        System.out.println("Original sentence: " + inputSentence);

	        // Reverse the words
	        String reversedSentence = reverseWords(inputSentence);

	        System.out.println("Sentence after reversing words: " + reversedSentence);
	    }
	}

