package craps;
public class Wallet {
	private double currMoney;
	private double currBet;
	
	public Wallet(double money) {
		this.currMoney = money;
	}
	
//	public void setBet(String string){
//		System.out.println("Incorrect Input");
//	}
	
	public String setBet(double money){
		if(money>this.currMoney) {
			this.currBet = this.currMoney;
			return "You don't have enough chips!";
		}else {
			this.currBet = money;
			return "Good luck! Bet is "+ this.currBet;
		}
		
	}
	
	public String setMoney(double amount, boolean win) {
		System.out.println("passed bet: " + amount);
		if(this.currMoney < 0)
		{
			return "You are out of money!";
		}
		else
		{
			if(win == true) 
			{
				this.currMoney += amount;
			}
			else
			{
				this.currMoney -= amount;
			}
			return "Good luck shooter!";
		}
	}
	
	public double getMoney() {
		return this.currMoney;
	}
	
	public double getBet() {
		return this.currBet;
	}
}
