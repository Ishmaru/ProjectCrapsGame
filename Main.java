import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to tech talent south craps");
		System.out.println("Press '1' to Shoot '2' to quit");
		
		DiceRoll dice =  new DiceRoll();
		int current = 0;
		
		Scanner scanObj = new Scanner(System.in);
		int selection = scanObj.nextInt();
		
		if(selection == 1) 
		{
			int res = dice.initialRoll(dice.rollDice());
			
			if(res == 1) 
			{
				System.out.println("Win");
			}
			else if (res == -1)
			{
				System.out.println("Loss");
			}
			else
			{
				while(current == 0){
					current = dice.secondaryRoll(dice.rollDice());
					if(current==-1)
					{
						System.out.println("Loss");
					}
					if(current==1)
					{
						System.out.println("Win");
					}
				}
			}
		}
	}
}
