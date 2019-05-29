package craps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class WalletTest {
	Wallet testWallet = new Wallet(1000.00);
	
	@Test
	void testLosses() {
		double result = testWallet.setMoney(1000, false);
		assertEquals(0, result);
	}
	@Test
	void testWinnings() {
		double result = testWallet.setMoney(1000, true);
		assertEquals(2000, result);
	}
	@Test
	void testOverbetPositive() {
		double result = testWallet.setBet(1500);
		assertEquals(1000,result);
	}
	@Test
	void testOverbetNegative() {
		double result = testWallet.setBet(900);
		assertEquals(900, result);
	}

}
