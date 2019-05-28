import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		System.out.println("Welcome to tech talent south craps");
		System.out.println("Press 'S' to Shoot 'Q' to quit");
		
		DiceRoll dice =  new DiceRoll();
		
		int rollNumber = 0;
		
		Scanner scanObj = new Scanner(System.in);
		String selection = scanObj.nextLine();
		
		if(selection == "s" || selection == "S") 
		{
			dice.rollDice();
		}
	}
	
	

}
