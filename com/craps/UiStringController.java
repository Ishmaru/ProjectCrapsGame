package com.craps;
import java.util.HashMap;

public class UiStringController {
	
	public static HashMap<Integer, String> generalText = new HashMap<>(); 
	static {
		generalText.put(1,"Welcome to Tech Talent South craps");
		generalText.put(2,"How much would you like to bet?");
		generalText.put(3,"Bets must be made in numbers!");
		generalText.put(4,"That's all you had left. But, you played well and had fun!");
	};
	
	public static HashMap<Integer, String> victoryText = new HashMap<>();
	static {
		victoryText.put(1,"Winner easy!");
		victoryText.put(-1,"Not this time, friend!");
		victoryText.put(0,"");
	};

	public static HashMap<Integer, String> partialText = new HashMap<>();
	static {
		partialText.put(1,"You have: ");
		partialText.put(2," Press 's' to shoot 'q' to quit");
		partialText.put(3,"You bet: ");
		partialText.put(4,"You rolled a: ");
		partialText.put(5," and a: ");
	};
	
	public static String getConcatString(int initial, double value) 
	{
		return partialText.get(initial) + value;
	};
	
	public static String getConcatString(int initial, double value, int second) 
	{
		return partialText.get(initial) + value + partialText.get(second);
	};
	
	public static String getConcatString(int initial, int value, int second, int value2) 
	{
		return partialText.get(initial) + value + partialText.get(second) + value2;
	};
}
