package com.vti.utils;

import java.util.Random;

public class RandomUtils {
	public static String randomNumber(int minValue, int maxValue) {
		Random random = new Random();
		int randomNumber = random.nextInt(minValue, maxValue);
		String numberString = String.valueOf(randomNumber);
		return numberString;
	}
}
