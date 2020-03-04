
public class WhileCounter {

	public static void main(String[] args) {
		int counter = 1; //counter variable - declaring and initializing control variable
		
		while (counter <= 10) { //loop-continuation condition
			System.out.printf("%d ", counter);
			++counter; //increment control variable
			
		}
		System.out.println();
	}

}
