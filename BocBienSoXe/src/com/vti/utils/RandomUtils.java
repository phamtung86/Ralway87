package com.vti.utils;

import java.util.Random;

public class RandomUtils {
	// Random so
	public static String randomNumber(int minValue, int maxValue) {
		Random random = new Random();
		int randomNumber = random.nextInt(minValue, maxValue);
		String numberString = String.valueOf(randomNumber);
		return numberString;
	}

	// Random kí tự
	public static char randomChar() {
		Random random = new Random();
		char charRandom = (char) (random.nextInt(26) + 'A');
		return charRandom;
	}
}
