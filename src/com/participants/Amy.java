package com.participants;

import com.game.structure.*;

public class Amy extends Opponent
{
	protected boolean isRandom = true;
	GameMath justAmy = new GameMath();
	String amysChoice = justAmy.getRandomChoice();
	
	public Amy(String name, boolean randomThrow, boolean isRandom, GameMath justAmy, String amysChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justAmy = justAmy;
		this.amysChoice = amysChoice;
	}

	public Amy()
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

	public GameMath getJustAmy()
	{
		return justAmy;
	}

	public void setJustAmy(GameMath justAmy)
	{
		this.justAmy = justAmy;
	}

	public String getAmysChoice()
	{
		return amysChoice;
	}

	public void setAmysChoice(String amysChoice)
	{
		this.amysChoice = amysChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
	
	
}
