package monsters.controller;

import java.awt.Component;

import monsters.model.MarshmallowMonster;
import monsters.view.MonsterView;

public class MonsterAppController
{
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;
	
	
	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Teddy", 4.0, 3.0, 5, 1, 3, true);
		otherMonster = new MarshmallowMonster("Scruf", 2, 0.2, 6, 2, 1, false);
		
	}
	
	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}
	
	public void start()
	{
		myAppView.displayInformation();
	}

	public MarshmallowMonster getOtherMonster()
	{
		return otherMonster;
	}
	
}
