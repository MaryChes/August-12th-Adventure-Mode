package com.participants;

import com.game.structure.GameMath;

public class David extends Opponent
{
	protected boolean isRandom = false;
	GameMath justDavid = new GameMath();
	String davidsChoice = justDavid.notRandomChoiceSpock();
	
	public David(String name, boolean randomThrow, boolean isRandom, GameMath justDavid, String davidsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justDavid = justDavid;
		this.davidsChoice = davidsChoice;
	}

	public David()
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

	public GameMath getJustDavid()
	{
		return justDavid;
	}

	public void setJustDavid(GameMath justDavid)
	{
		this.justDavid = justDavid;
	}

	public String getDavidsChoice()
	{
		return davidsChoice;
	}

	public void setDavidsChoice(String davidsChoice)
	{
		this.davidsChoice = davidsChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
	
}
