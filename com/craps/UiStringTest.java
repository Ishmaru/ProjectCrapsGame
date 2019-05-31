package com.craps;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class UiStringTest {
	UiStringController uiString = new UiStringController();
	
	@Test
	void testStringReturn1() {
		String results = uiString.generalText.get(1);
		assertEquals("Welcome to Tech Talent South craps", results);
	}
	
	@Test
	void testStringReturn2() {
		String results = uiString.victoryText.get(-1);
		assertEquals("Not this time, friend!", results);
	}

	@Test
	void testConcatString1() {
		String results = uiString.getConcatString(3, 10.0);
		assertEquals("You bet: 10.0", results);
	}
	
	@Test
	void testConcatString2() {
		String results = uiString.getConcatString(1, 1000.0, 2);
		assertEquals("You have: 1000.0 Press 's' to shoot 'q' to quit", results);
	}
	
	@Test
	void testConcatString3() {
		String results = uiString.getConcatString(4, 5, 5, 6);
		assertEquals("You rolled a: 5 and a: 6", results);
	}
}
