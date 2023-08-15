import java.util.Random;
import java.util.Scanner;

public class NumberGuesser {

	public NumberGuesser() {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int x = random.nextInt(10)+1;
		int randomNum= x;
		int limit = 11;
		int attempts = 5;
		int i = 0;
		int guess = 0;
		
	  while(i != attempts) {
		
		System.out.println("   ");  
		//System.out.println("random number is " + randomNum);
		System.out.println("Guess a number between 1 to 10");
		guess = scanner.nextInt();
		
		System.out.println("You guessed " + guess);
			if(guess > randomNum && guess < limit) {
				System.out.println("Lower");
				i++;
			}
			else if(guess < randomNum) {
				System.out.println("Higher");
				i++;
			}
			else if (guess == randomNum) {
				System.out.println("Correct");
				break;
			}
			else if (guess >= limit) {
				System.out.println("you are out of range");
			}
			else { 
				System.out.println("Try again");
			}
			System.out.println("Attempt number: "+ i +" out of 5");
	  }//end while loop
	  if(i == attempts) {
		  System.out.println("YOU LOSE!!!");
	  }
	  else { 
		  System.out.println("YOU WIN!!!");
	  }
	}// end NumberGuesser()
}// end class