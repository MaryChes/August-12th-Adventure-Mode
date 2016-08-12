package com.participants;

import com.game.structure.*;

public class Bill extends Opponent
{
	protected boolean isRandom = false;
	GameMath justBill = new GameMath();
	String billsChoice = justBill.notRandomChoiceRock();
	public Bill(String name, boolean randomThrow, boolean isRandom, GameMath justBill, String billsChoice)
	{
		super(name, randomThrow);
		this.isRandom = isRandom;
		this.justBill = justBill;
		this.billsChoice = billsChoice;
	}
	public Bill()
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
	
	public GameMath getJustBill()
	{
		return justBill;
	}
	
	public void setJustBill(GameMath justBill)
	{
		this.justBill = justBill;
	}
	
	public String getBillsChoice()
	{
		return billsChoice;
	}
	
	public void setBillsChoice(String billsChoice)
	{
		this.billsChoice = billsChoice;
	}
	
	@Override
	public void takeATurn()
	{
		// TODO Auto-generated method stub

	}
			
}
