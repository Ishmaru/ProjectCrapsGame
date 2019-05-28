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
	void checkRoll1Win() {
		int results = testRoll.initialRoll(7);
		assertEquals(1, results);
	}
	@Test
	void checkRoll2Loss() {
		int results = testRoll.secondaryRoll(7);
		assertEquals(-1, results);
	}
	@Test
	void checkRoll2Win() {
		testRoll.point = 10;
		int results = testRoll.secondaryRoll(10);
		assertEquals(1, results);
	}
}
