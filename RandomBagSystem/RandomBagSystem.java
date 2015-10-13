import java.util.ArrayList;
import java.util.List;

public class RandomBagSystem {

	static final int NUMBER_OF_PIECES = 7;
	static final int TOTAL_SYMBOLS = 50;
	
	static String[] bag = {"O", "I", "S", "Z", "L", "J", "T"};
	static List<String> output = new ArrayList<String>();

	
	public static void main(String[] args) {
		int currentSymbol = 0;
		
		// it's running for 50 times
		while(currentSymbol < TOTAL_SYMBOLS) {
			do {
				int number = (int)(Math.random() * 7); // random number between 0 and 7
				
				// checking if the letter is already used
				if(!output.contains(bag[number])) {  
					output.add(bag[number]);
					currentSymbol++;
				}
				// stops at 50 symbols
				if (currentSymbol == 50)
					break;
			} while (output.size() != 7);
			
			// printing
			for (int i = 0; i < output.size(); i++) {
				System.out.print(output.get(i));
			}
			
			// clear the list
			output.clear();
		}
	}
}
	
