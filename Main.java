//Midterm by Adrian & Jason

import java.util.Scanner;
import com.craps.DiceRoll;
import com.craps.Wallet;



public class Main {

	public static void main(String[] args) {
		//Initialize instances here:
		DiceRoll dice =  new DiceRoll();
		Wallet wallet =  new Wallet(1000.00);
		
		//Initial Message
		System.out.println("Welcome to Tech Talent South craps");
		System.out.println("You have: " + wallet.getMoney() + " Press 's' to shoot 'q' to quit");
		Scanner scanObj = new Scanner(System.in);
		String selection = scanObj.nextLine();
		
		// while game loop. Waits for player response, ends when out of money or player types "q"
		while(!selection.equals("q") && wallet.getMoney()>0) 
		{
			int current = 0;
			if(selection.equals("s") || selection.equals("S")) 
			{
				scanObj = new Scanner(System.in);
				System.out.println("How much would you like to bet?");
				
				// In case a input cannot be resolved to a double, set bet to 0.0;
				double bet = 0;
				try {
					bet = scanObj.nextDouble();
				}
				catch(Exception e) {
					System.out.println("Bets must be made in numbers!");
				}
				wallet.setBet(bet);
				System.out.println("You bet: " + wallet.getBet());
				
				
				//Roll dice and Check results from initialRoll()
				int res = dice.initialRoll(dice.rollDice());
				if(res == 1) 
				{
					System.out.println("Winner easy!");
					wallet.setMoney(wallet.getBet(), true);
				}
				else if (res == -1)
				{
					System.out.println("Not this time, friend!");
					wallet.setMoney(wallet.getBet(), false);
				}
				else
				{
					//While loop for successive rolls after first
					while(current == 0)
					{
						current = dice.secondaryRoll(dice.rollDice());
						
						//Check results from secondaryRoll()
						if(current==-1)
						{
							System.out.println("Sorry, you crapped out!");
							wallet.setMoney(wallet.getBet(), false);
						}
						if(current==1)
						{
							System.out.println("Winner, winner chicken dinner!");
							wallet.setMoney(wallet.getBet(), true);
						}
					}
				}
			}
			
			//Re initialize for new game
			DiceRoll.point = 0;
			if(wallet.getMoney()>0)
			{
				System.out.println("You have: " + wallet.getMoney() + " Press 's' to shoot 'q' to quit");
				
				//Make a new Scanner prompt
				scanObj = new Scanner(System.in);
				selection = scanObj.nextLine();
			}
			else
			{
				System.out.println("That's all you had left. But, you played well and had fun!");
			}
			
		}
		scanObj.close();  //manual scanner object close as failsafe

	}
}
