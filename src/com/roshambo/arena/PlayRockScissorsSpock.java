package com.roshambo.arena;

import java.util.Scanner;
import com.game.structure.*;
import com.participants.*;

public class PlayRockScissorsSpock
{
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);
		GameMath model = new GameMath();
		String opponentThrow = null;
		String opponentChoice = null;
		String userChoice = null;
		String userAnswer = null;
		boolean contPlay = true;
		
		do
		{
			System.out.println("Welcome to the ROCK SCISSORS SPOCK Arena. I hope you are ready to throw down!!!");
			System.out.println("Please enter your name");
			String userName = userInput.nextLine().toUpperCase();
			
			do
			{
			System.out.println("Welcome " + userName + "! It's time to choose your opponent");
			System.out.println("Would you like to throw down with:"
				+ "\n\tAdam"
				+ "\n\tAmy"
				+ "\n\tBeth"
				+ "\n\tBill"
				+ "\n\tDavid"
				+ "\n\tJoe"
				+ "\n\tJohn"
				+ "\n\tPaul"
				+ "\n\tThomas"
				+ "\n\tTucker");
				 opponentChoice = userInput.nextLine();
			} 
			while (Validation.isValidOpponent(opponentChoice));
			
			
			do
			{
			System.out.println("Would you like to throw:"
				+ "\n\tRock"
				+ "\n\tPaper"
				+ "\n\tScissors"
				+ "\n\tLizard"
				+ "\n\tSpock?");
			
			
			userChoice = userInput.nextLine().toUpperCase();
			}
			while (Validation.isValidWeapon(userChoice));
			
			switch(opponentChoice.toUpperCase())
			{
				case "BETH":
					Beth bethInArena = new Beth();
					opponentThrow = bethInArena.getBethsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break;
		
				case "ADAM":
					Adam adamInArena = new Adam();
					opponentThrow = adamInArena.getAdamsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break;
		
				case "TUCKER":
					Tucker tuckerInArena = new Tucker();
					opponentThrow = tuckerInArena.getTuckersChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break;  
				
				case "AMY":
					Amy amyInArena = new Amy();
					opponentThrow = amyInArena.getAmysChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
					
				case "BILL":
					Bill billInArena = new Bill();
					opponentThrow = billInArena.getBillsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
					
				case "DAVID":
					David davidInArena = new David();
					opponentThrow = davidInArena.getDavidsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
					
				case "JOE":
					Joe joeInArena = new Joe();
					opponentThrow = joeInArena.getJoesChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
					
				case "JOHN":
					John johnInArena = new John();
					opponentThrow = johnInArena.getJohnsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
					
				case "PAUL":
					Paul paulInArena = new Paul();
					opponentThrow = paulInArena.getPaulsChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
				
				case "THOMAS":
					Thomas thomasInArena = new Thomas();
					opponentThrow = thomasInArena.getThomassChoice();
					System.out.println(userName + ", you picked " + userChoice + "."
					+"\n" + opponentChoice + " picked " + opponentThrow + ".");
					break; 
			}
		
			String arenaOutcome = model.getGameOutcome(userChoice, opponentThrow);
		
			if(arenaOutcome.equalsIgnoreCase("win"))
			{
				System.out.println(userName + ", you won!");
			}
			else if (arenaOutcome.equalsIgnoreCase("lose"))
			{
				System.out.println(userName + ", you lost to " + opponentChoice + "!");
			}
			else if (arenaOutcome.equalsIgnoreCase("tie"))
			{
				System.out.println("The game was a tie");
			}
			System.out.println();
		
			do
			{
			System.out.println("Do you wish to play again?"
				+ "\n\tYes"
				+ "\n\tNo");
			 userAnswer = userInput.nextLine();
			}
			while (Validation.isValidEntry(userAnswer));
			
			if(userAnswer.equalsIgnoreCase("no"))
			{
				contPlay = false;
			}
		
			} while (contPlay);	
			userInput.close();
			System.out.println("Thanks for playing! Goodbye :)");
			System.exit(0);
	}
}
