package craps;
public class Wallet {
	private double currMoney;
	private double currBet;
	
	public Wallet(double money) 
	{
		this.currMoney = money;
	}
	
	//Sets the bet amount, if more than the currentMoney then bet all current Money
	public double setBet(double money)
	{
		if(money>this.currMoney) 
		{
			this.currBet = this.currMoney;
		}else {
			this.currBet = money;
		}
		return this.currBet;
	}
	
	//Ads or subtracts based on win or loss
	public double setMoney(double amount, boolean win) 
	{
		if(win == true) 
		{
			this.currMoney += amount;
		}
		else
		{
			this.currMoney -= amount;
		}
		return this.currMoney;
	}
	
	public double getMoney() 
	{
		return this.currMoney;
	}
	
	public double getBet() 
	{
		return this.currBet;
	}
}
