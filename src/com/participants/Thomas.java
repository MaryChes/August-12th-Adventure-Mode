package com.participants;

import com.game.structure.*;

public class Thomas extends Opponent
{
	private boolean isRandom = true;
	GameMath justThomas = new GameMath();
	String thomassChoice = justThomas.getRandomChoice();
	
	public Thomas(String name, boolean randomThrow, boolean isRandom, GameMath justThomas, String thomassChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justThomas = justThomas;
		this.thomassChoice = thomassChoice;
	}

	public Thomas()
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

	public GameMath getJustThomas()
	{
		return justThomas;
	}

	public void setJustThomas(GameMath justThomas)
	{
		this.justThomas = justThomas;
	}

	public String getThomassChoice()
	{
		return thomassChoice;
	}

	public void setThomassChoice(String thomassChoice)
	{
		this.thomassChoice = thomassChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
	
	
}
