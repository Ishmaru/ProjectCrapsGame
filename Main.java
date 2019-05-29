import java.util.Scanner;

import com.craps.DiceRoll;
import com.craps.Wallet;
public class Main {

	public static void main(String[] args) {
		
		DiceRoll dice =  new DiceRoll();
		Wallet wallet =  new Wallet(1000.00);
		
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
				double bet = scanObj.nextDouble();
				wallet.setBet(bet);
				
				int res = dice.initialRoll(dice.rollDice());
				
				if(res == 1) 
				{
					System.out.println("Win");
					wallet.setMoney(wallet.getBet(), true);
				}
				else if (res == -1)
				{
					System.out.println("Loss");
					wallet.setMoney(wallet.getBet(), false);
				}
				else
				{
					//While loop for successive rools after first
					while(current == 0){
						current = dice.secondaryRoll(dice.rollDice());
						if(current==-1)
						{
							System.out.println("Loss");
							wallet.setMoney(wallet.getBet(), false);
						}
						if(current==1)
						{
							System.out.println("Win");
							wallet.setMoney(wallet.getBet(), true);
						}
					}
				}
			}
			dice.point = 0;
			System.out.println("You have: " + wallet.getMoney() + " Press 's' to shoot 'q' to quit");
			scanObj = new Scanner(System.in);
			selection = scanObj.nextLine();
		}
		scanObj.close();

	}
}
