import java.util.Scanner;
//import java.util.Random;

public class DiceRoll {
	
	public int rollDice(){
		
		int dice1 = 1 + (int)(Math.random() * 6);
		int dice2 = 1 + (int)(Math.random() * 6);
		
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
			return 0;
		}
	}
	
	
}
