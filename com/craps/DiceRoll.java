package com.craps;
import java.util.Scanner;
//import java.util.Random;

public class DiceRoll {
	public static int point;
	UiStringController uiString =  new UiStringController();
	
	public int rollDice(){
		
		int dice1 = 1 + (int)(Math.random() * 6);
		int dice2 = 1 + (int)(Math.random() * 6);
		System.out.println(uiString.getConcatString(4,dice1, 5,dice2));
//		System.out.println("You rolled a: " + dice1 + " and a: " + dice2);
		return dice1 + dice2;
	}
	
	//Method handles conditions of first roll only. Returns -1 = loss, 1 = wins, 0 = reRoll.
	public int initialRoll(int total){
			
		if(total == 7 || total == 11) 
		{
			return 1;
		}
		else if (total == 2 || total == 3 || total == 12)
		{
			return -1;
		}
		else
		{
			point = total;
			return 0;
		}
	}
	
	//Method handles conditions of rolls two and onward. Returns -1 = loss, 1 = wins, 0 = reRoll.
	public int secondaryRoll(int total){
		if(total == point)
		{
			return 1;
		}
		else if (total == 7)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}
}
