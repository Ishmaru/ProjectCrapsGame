import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MainTest {

	DiceRoll testRoll = new DiceRoll();
	
	@Test
	void roll() {
		int results = testRoll.rollDice();
		assertNotNull(results);

	}
	@Test
	void checkRoll1() {
		int results = testRoll.initialRoll(testRoll.rollDice());
		assertEquals(0, results);
	}
}
