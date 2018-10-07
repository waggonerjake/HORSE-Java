//
//// Honor Pledge:
//// //
//// // I pledge that I have neither given nor
//// // received any help on this assignment.
//// //
//// // jwaggon
//

//Import scanner for input
import java.util.Scanner;

public class Game extends Player
{
	public static void main(String[] args)
	{
		//Create the two player objects
		Player player1 = new Player();
		Player player2 = new Player();
		//Create the scanner object for input
		Scanner input = new Scanner(System.in);
		while(true)
		{
			//Let player 1 shoot their shot
			player1.Shoot();
		        if(player1.getPlayerBucket()==false)
			{
				//If the player misses, tell them they missed
				System.out.println("Player 1: Missed Shot!");	
			}	
			else if(player1.getPlayerBucket() == true)
			{
				//If the player makes it, tell them they made it
				System.out.println("Player 1: Hit Shot!");
			}
			//Let player 2 shoot their shot
			player2.Shoot();
			if(player2.getPlayerBucket() == false)
			{
				//If the player misses, tell them they missed
				System.out.println("Player 2: Missed Shot!");
			}
			else if(player2.getPlayerBucket() == true)
			{
				//If the player made it, tell them they made it
				System.out.println("Player 2: Hit Shot!");
			}
			
			if(player1.getPlayerBucket() == true && player2.getPlayerBucket() == false)
			{
				//If player 1 made it,and player 2 missed, give player 2 the next letter
				//in horse
				System.out.println("\tPlayer 2 Added An: " + player2.ReceiveLetter());
			}		
			else if(player1.getPlayerBucket() == false && player2.getPlayerBucket() == true)
			{
				//if player 2 made it, and player 1 missed, give player 1 the next
				//letter in horse
				System.out.println("\tPlayer 1 Added An: " + player1.ReceiveLetter());
			}
			//Checking to see if the player 1 has reached HORSE
			if(player1.getCounter() >= 5)
			{
				//Print the winner and loser, with their corresponding score
				System.out.println("Player 2 Wins!: "+ player2.getScore() + " :: " + "Player 1: " +player1.getScore() );
				//Ask the user for input if they would like to play again
				System.out.println("Would you like to play again? (Y|N)");
				String reply = input.next();
				//If the player says Y, create new players and start again
				if(reply.equals("Y"))
				{
					player1 = new Player();
					player2 = new Player();
				}
				//If the player says N, end the loop and program
				else if(reply.equals("N"))
				{
					break;
				}
				//If the player says anything else, end it too.
				else
				{
					System.out.println("Thanks thanks for playing!");
					break;
				}
			}
			//Chekcing to see if the player 2 has reached HORSE
			else if(player2.getCounter() >= 5)
			{
				//Same deal as the if statement as above, around line 61
				System.out.println("Player 1 Wins!: " + player1.getScore() + " :: " + "Player 2: " + player2.getScore());
				System.out.println("Would you like to play again?  (Y|N)");
				String reply = input.next();
				if(reply.equals("Y"))
				{
					player1 = new Player();
					player2 = new Player();
				}
				else if(reply.equals("N"))
				{
					break;
				}
				else
				{
					System.out.println("Thanks thanks for playing!");
					break;
				}

			}
		}
	}

}
