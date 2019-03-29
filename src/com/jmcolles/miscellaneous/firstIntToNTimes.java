package com.jmcolles.miscellaneous;
import java.util.HashMap;
public class firstIntToNTimes {

	public static void main(String[] args) {
		int[] asdf = { 15, 38, 1, 1, 87, 12, 34, 38, 38, 10 };
		int x = 3;
		int result = method(asdf, x);
		System.out.println(result + " appeared " + x + " times before any other number");
	}

	public static int method(int[] numbers, int x) {
		if (x == 1) {
			return numbers[0];
		} else if (x < 1) {
			return -1;
		}
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int i = 0; i < numbers.length - 1; i++) {
			int key = numbers[i];
			if (!hmap.containsKey(key)) {
				// number doesn't exist yet, add
				hmap.put(key, 1);
			} else {
				// already exists, increment the count
				int count = hmap.get(key);
				count++;
				if (count >= x) {
					// found answer
					return key;
				} else {
					// increment count;
					hmap.replace(key, count);
				}
			}
		}
		return -1;
	}
}
