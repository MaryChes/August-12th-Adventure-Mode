package com.game.structure;

public class GameMath
{
	private int wins = 0;
	private int losses = 0;
	private int ties = 0;
	
	public String getGameOutcome(String userChoice, String opponentChoice)
	{
		if(userChoice.equalsIgnoreCase("ROCK"))
		{
			if(opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "win";	
			}
			else if(opponentChoice.equalsIgnoreCase("LIZARD"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("SPOCK"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "tie";
			}
		}
		else if(userChoice.equalsIgnoreCase("PAPER"))
		{
			if(opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("LIZARD"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("SPOCK"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "tie";
			}
		}
		else if(userChoice.equalsIgnoreCase("SCISSORS"))
		{
			if(opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("LIZARD"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("SPOCK"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "tie";
			}	
		}
		else if(userChoice.equalsIgnoreCase("SPOCK"))
		{
			if(opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("LIZARD"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("SPOCK"))
			{
				return "tie";
			}
			else if(opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "win";
			}	
		}
		else if(userChoice.equalsIgnoreCase("LIZARD"))
		{
			if(opponentChoice.equalsIgnoreCase("ROCK"))
			{
				return "lose";
			}
			else if(opponentChoice.equalsIgnoreCase("PAPER"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("LIZARD"))
			{
				return "tie";
			}
			else if(opponentChoice.equalsIgnoreCase("SPOCK"))
			{
				return "win";
			}
			else if(opponentChoice.equalsIgnoreCase("SCISSORS"))
			{
				return "lose";
			}
		}
		return null;
	}
	
	public String getRandomChoice()
	   {
		double d = Math.random();
		if(d < .20)
		{
			return "ROCK";
		}
		else if(d < .40)
		{
			return "PAPER";	
		}
		else if(d < .60)
		{
			return "SCISSORS";	
		}
		else if(d < .80)
		{
			return "SPOCK";	
		}
		else
		{
			return "LIZARD";
		}
	}
	
	public String notRandomChoiceScissors()
	{
		return "SCISSORS";
	}
	
	public String notRandomChoiceRock()
	{
		return "ROCK";
	}
	
	public String notRandomChoicePaper()
	{
		return "PAPER";
	}
	
	public String notRandomChoiceSpock()
	{
		return "SPOCK";
	}
	
	public String notRandomChoiceLizard()
	{
		return "Lizard";
	}
}
