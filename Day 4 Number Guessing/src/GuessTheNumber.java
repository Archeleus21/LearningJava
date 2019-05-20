import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber 
{

	//'static' makes it a class function
	//checks number and outputs certain lines of text
	public static void HowBigIsMyNumber(int num)
	{
		if(num >= 0 && num <= 10)
		{
			System.out.println("Number is small!");
		}
		else if(num >= 11 && num <= 100)
		{
			System.out.println("Number is big!");
		}
		else
		{
			System.out.println("Number is out of range!");
		}
	}
	
	int theNumber;
	
	int maxNum;
	//need to import java.util.Scanner;
	//allows keyboard input
	Scanner scanner = new Scanner(System.in);
	//creates random number
	public GuessTheNumber()
	{
		//generates random number
		Random rand = new Random();
		//math.abs gets random number between 0 and some large number
		//we need a number between 0 and maxNum
		//we add 1 to make the maxNum inclusive
		maxNum = 100;
		theNumber = Math.abs(rand.nextInt() % (maxNum + 1));
	}
	
	public void Play()
	{
		System.out.println("Guess a number between 0 and 100 to play the game!");
		
		//loops until right answer is found
		while(true)
		{
			System.out.println("Enter your guess: " );
			//takes player input, its in the loop so the player can
			//create a new guess each time
			int playerGuess = scanner.nextInt();
			
			if(playerGuess > theNumber)
			{
				System.out.println("Your number is higher than the answer!");
			}
			else if(playerGuess < theNumber)
			{
				System.out.println("Your number is lower than the answer!");
			}
			else
			{
				System.out.println("You guessed the right number!");
				break;
			}
		}
		
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//creates new instance of game
		GuessTheNumber guessGame = new GuessTheNumber();
		//plays the Game
		guessGame.Play();
		
		/*
		HowBigIsMyNumber(0);
		HowBigIsMyNumber(10);
		HowBigIsMyNumber(11);
		HowBigIsMyNumber(100);
		HowBigIsMyNumber(5);
		HowBigIsMyNumber(75);
		HowBigIsMyNumber(-1);
		HowBigIsMyNumber(105);
		*/
		
		
	}

}
