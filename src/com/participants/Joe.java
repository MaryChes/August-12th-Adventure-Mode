package com.participants;

import com.game.structure.*;

public class Joe extends Opponent
{
	protected boolean isRandom = true;
	GameMath justJoe = new GameMath();
	String joesChoice = justJoe.getRandomChoice();
	public Joe(String name, boolean randomThrow, boolean isRandom, GameMath justJoe, String joesChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justJoe = justJoe;
		this.joesChoice = joesChoice;
	}
	public Joe()
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
	public GameMath getJustJoe()
	{
		return justJoe;
	}
	public void setJustJoe(GameMath justJoe)
	{
		this.justJoe = justJoe;
	}
	public String getJoesChoice()
	{
		return joesChoice;
	}
	public void setJoesChoice(String joesChoice)
	{
		this.joesChoice = joesChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
}
