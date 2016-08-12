package com.participants;

import com.game.structure.*;

public class John extends Opponent
{
	protected boolean isRandom = false;
	GameMath justJohn = new GameMath();
	String johnsChoice = justJohn.notRandomChoicePaper();
	
	public John(String name, boolean randomThrow, boolean isRandom, GameMath justJohn, String johnsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justJohn = justJohn;
		this.johnsChoice = johnsChoice;
	}
	
	public John()
	{
	}

	public boolean isRandom()
	{
		return isRandom;
	}

	public void setRandom(boolean isRandom)
	{
		this.isRandom = isRandom;
	}

	public GameMath getJustJohn()
	{
		return justJohn;
	}

	public void setJustJohn(GameMath justJohn)
	{
		this.justJohn = justJohn;
	}

	public String getJohnsChoice()
	{
		return johnsChoice;
	}

	public void setJohnsChoice(String johnsChoice)
	{
		this.johnsChoice = johnsChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
	
}
