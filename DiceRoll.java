import java.util.Scanner;
//import java.util.Random;

public class DiceRoll {
	static int point;
	public int rollDice(){
		
		int dice1 = 1 + (int)(Math.random() * 6);
		int dice2 = 1 + (int)(Math.random() * 6);
		System.out.println("You rolled a: " + dice1 + " and a: " + dice2);
		return dice1 + dice2;
	}
	
	
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
