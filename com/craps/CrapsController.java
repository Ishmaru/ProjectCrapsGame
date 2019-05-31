package com.craps;

import java.util.Scanner;

public class CrapsController 
{

	//Initialize instances here:
	UiStringController uiString =  new UiStringController();
	DiceRoll dice =  new DiceRoll();
	Wallet wallet =  new Wallet(1000.00);
	
	public void startGame() 
	{
		//Initial Message
		System.out.println(uiString.generalText.get(1));
		System.out.println(uiString.getConcatString(1, wallet.getMoney(), 2));

		Scanner scanObj = new Scanner(System.in);
		String selection = scanObj.nextLine();
		
		while(!selection.equals("q") && wallet.getMoney()>0) 
		{
			int current = 0;
			if(selection.equals("s") || selection.equals("S")) 
			{
				scanObj = new Scanner(System.in);
				System.out.println(uiString.generalText.get(2));
				
				// In case a input cannot be resolved to a double, set bet to 0.0;
				double bet = 0;
				try 
				{
					bet = scanObj.nextDouble();
				}
				catch(Exception e) {
					System.out.println(uiString.generalText.get(3));
				}
				wallet.setBet(bet);
				System.out.println(uiString.getConcatString(1, wallet.getBet()));
				
				
				//Roll dice and Check results from initialRoll()
				int res = dice.initialRoll(dice.rollDice());
				
				if(res == 1) 
				{
					System.out.println(uiString.victoryText.get(res));
					wallet.setMoney(wallet.getBet(), true);
				}
				else if (res == -1)
				{
					System.out.println(uiString.victoryText.get(res));
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
							System.out.println(uiString.victoryText.get(current));
							wallet.setMoney(wallet.getBet(), false);
						}
						if(current==1)
						{
							System.out.println(uiString.victoryText.get(current));
							wallet.setMoney(wallet.getBet(), true);
						}
					}
				}
			}
			
			//Re initialize for new game
			DiceRoll.point = 0;
			if(wallet.getMoney()>0)
			{
				System.out.println(uiString.getConcatString(1, wallet.getMoney(), 2));
				
				//Make a new Scanner prompt
				scanObj = new Scanner(System.in);
				selection = scanObj.nextLine();
			}
			else
			{
				System.out.println(uiString.generalText.get(4));
			}
			
		}
		scanObj.close();  //manual scanner object close as failsafe
	};
}
