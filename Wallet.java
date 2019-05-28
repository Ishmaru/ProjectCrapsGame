public class Wallet {
	private double currMoney;
	private double currBet;
	
	public Wallet(double money) {
		this.currMoney = money;
	}
	
	public void setBet(double money){
		this.currBet = money;
	}
	
	public void setMoney(double amount) {
		this.currMoney += amount;
	}
	
	public double getMoney() {
		return currMoney;
	}
	
	public double getBet() {
		return this.currBet;
	}
}
