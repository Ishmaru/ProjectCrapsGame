package craps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WalletTest {
	Wallet testWallet = new Wallet(1000.00);
	
	@Test
	void testBankruptcy() {
		String result = testWallet.setMoney(-2000, false);	
		assertEquals("You are out of money!", result);
	}
	@Test
	void testBankrupcyNegative() {
		String result = testWallet.setMoney(1000, false);
		assertEquals("Good luck shooter!", result);
	}
	@Test
	void testOverbetPositive() {
		String result=testWallet.setBet(1500);
		assertEquals("You don't have enough chips!",result);
	}
	@Test
	void testOverbetNegative() {
		String result=testWallet.setBet(900);
		assertEquals("Good luck! Bet is "+testWallet.getBet(), result);
	}

}
