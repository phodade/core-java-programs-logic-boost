package Programs;

public class Count_Number_Words_Sentence 
{

	    public static int countWords(String sentence) 
	    {
	        // Check if the sentence is not empty
	        if (sentence == null || sentence.trim().isEmpty())
	        {
	            throw new IllegalArgumentException("Sentence is empty or null");
	        }

	        // Split the sentence into words and count them
	        String[] words = sentence.split("\\s+");
	        return words.length;
	    }

	    public static void main(String[] args) 
	    {
	        // Example usage
	        String inputSentence = "Hello World";
	        System.out.println("Original sentence: " + inputSentence);

	        // Count the number of words
	        int wordCount = countWords(inputSentence);

	        System.out.println("Number of words in the sentence: " + wordCount);
	    }
	}

