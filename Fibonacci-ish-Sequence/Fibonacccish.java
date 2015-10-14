import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacccish {
	static Scanner input = new Scanner(System.in);
	static int j = 1;
	
	public static void main(String[] args) {		
		System.out.print("Gimme the number: ");
		int x = input.nextInt();
		
		List<Integer> numbers = new ArrayList<>();
		
		numbers.add(0,0); // [0] = 1
		numbers.add(numbers.get(numbers.size() - 1) + j);
		
		while(true) {
				numbers.add(numbers.get(numbers.size() - 1) + numbers.get(numbers.size() - 2)); // [2]
				
				if ((numbers.get(numbers.size() - 1)) == x){
					System.out.println("You did it!");
					break;
				}
				else if (numbers.get(numbers.size() - 1) > x) {
					System.out.println("Restarting!");
					numbers.clear();
					numbers.add(0,0);
					j++;
					numbers.add(numbers.get(numbers.size() - 1) + j);			
				}
			}
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}
}
