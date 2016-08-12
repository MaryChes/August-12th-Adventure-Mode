package com.participants;

import com.game.structure.*;

public class Paul extends Opponent
{

	protected boolean isRandom = false;
	GameMath justPaul = new GameMath();
	String paulsChoice = justPaul.notRandomChoiceLizard();
	
	public Paul(String name, boolean randomThrow, boolean isRandom, GameMath justPaul, String paulsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justPaul = justPaul;
		this.paulsChoice = paulsChoice;
	}

	public Paul()
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

	public GameMath getJustPaul()
	{
		return justPaul;
	}

	public void setJustPaul(GameMath justPaul)
	{
		this.justPaul = justPaul;
	}

	public String getPaulsChoice()
	{
		return paulsChoice;
	}

	public void setPaulsChoice(String paulsChoice)
	{
		this.paulsChoice = paulsChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
}
