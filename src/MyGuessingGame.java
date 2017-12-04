import java.util.Scanner;


public class MyGuessingGame {
	

	
	int guess;
	int theAnswer;
	Scanner sc;
	
	public MyGuessingGame() {
		
		sc = new Scanner(System.in);
		
	}
	
	public void createAnswer() {
		
		/* random number needs to be from 1 to 100. Since numbers start at 0, 
		I multiplied the possible input by 100 and added 1 to start the count at 1.
		*/
		theAnswer = (int)(Math.random()*100 + 1);
			
	}
	
	
	public void getGuess() {
		guess = sc.nextInt();
		
	}
	
	public void checkGuess() {
		
		if (guess > theAnswer) {
			System.out.println(guess + " is too high! Guess again!");
		}
		
		else if (guess < theAnswer) {
			System.out.println(guess + " is too low! Guess again!");
		}
		
		else {
			System.out.println(guess + " is correct! Nice job!");
		}
	}
	

	public static void main(String[] args) {
			
		MyGuessingGame GuessingGame = new MyGuessingGame();
		
		do {			
		
			GuessingGame.createAnswer();
			GuessingGame.getGuess();
			GuessingGame.checkGuess();
				
			while (GuessingGame.guess != GuessingGame.theAnswer) {
				GuessingGame.getGuess();
				GuessingGame.checkGuess();
			}
			
			System.out.print("Play Again? Press Y to Continue.");
			
		} while (GuessingGame.sc.next().charAt(0) == 'Y');
		
		System.out.println("Thank you for playing");
			
	}
	

}
