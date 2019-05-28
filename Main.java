import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to tech talent south craps");
		System.out.println("Press 's' to Shoot 'q' to quit");
		
		DiceRoll dice =  new DiceRoll();
		
		Scanner scanObj = new Scanner(System.in);
		String selection = scanObj.nextLine();
		
		while(!selection.equals("q") || !selection.equals("Q")) 
		{
			int current = 0;
			if(selection.equals("s") || selection.equals("S")) 
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
			dice.point = 0;
			scanObj = new Scanner(System.in);
			selection = scanObj.nextLine();
		}

	}
}
