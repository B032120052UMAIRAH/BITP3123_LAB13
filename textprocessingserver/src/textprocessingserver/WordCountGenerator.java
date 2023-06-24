package textprocessingserver;
import java.util.Date;

/**
 * This class generates count of word.
 * 
 * @author Umairah Hamir
 *
 */
public class WordCountGenerator {
	/*
	 * default constructor
	 */
	public WordCountGenerator()
	{
		
	}
	/**
	 * This method generates word count
	 * 
	 * @return word count in numeric
	 */
	public int getWordCount() {
		
		String input = "Hello, My name is Umairah Binti Hamir From BITS S2G1S."; // The Input Words   
		
		 if (input == null || input.isEmpty()) {
		      return 0;
		    }

		 String[] words = input.split("\\s+");
		 return words.length;
		
	}
}
