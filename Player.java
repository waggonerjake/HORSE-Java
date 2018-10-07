//
//// Honor Pledge:
//// //
//// // I pledge that I have neither given nor
//// // received any help on this assignment.
//// //
//// // jwaggon
//
//Import Random for a random number generator
import java.util.Random;

public class Player
{
	//Variable to check if the player made the shot or not	
	private boolean playerBucket;
	//String to hold the word horse
	private String horseKey;
	//Character array to hold the player's score
	private char[] playerScore;
	//A counter to iterate through the playerScore array
	private int letterCounter;
	//Defualt Constructor initializing all the variables except the boolean
	public Player()
	{
		horseKey = "HORSE";
		playerScore = new char[5];
		letterCounter = 0;
	}
	//Method to allow the player to shoot
	public void Shoot()
	{
		//Creates the random number generator
		Random rng = new Random();
		//Int for what the rng is
		int randomNumber = rng.nextInt(51);
		//Checking the 50/50 values
		if(randomNumber < 25)
		{
			setPlayerBucket(false);
		}
		else
		{
			setPlayerBucket(true);
		}
	}
	//Method to give the player their letter
	public char ReceiveLetter()
	{
		//Set the indentical index of playerScore to horseKey
		playerScore[letterCounter] = horseKey.charAt(letterCounter);
		//Increment the counter
		letterCounter++;
		//Return the next letter
		return playerScore[letterCounter-1];
	}
	//Getter for if they made the shot or not
	public boolean getPlayerBucket()
	{
		return playerBucket;
	}
	//Setter for if they made the shot or not
	public void setPlayerBucket(boolean setter)
	{
		playerBucket = setter;
	}
	//getter for the playerScore to print out their final score
	public String getScore()
	{
		//Change the char array to a string
		return new String(playerScore);
	}
	//Getter for the counter to check if the game is over
	public int getCounter()
	{
		return letterCounter;
	}
}
