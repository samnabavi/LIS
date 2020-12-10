package longestincreasingsubsequence;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Random;

public class LIS2 {
	
	public static int[] numbers = new int[100];
	//Random rand = new Random();
	public LIS2() {
		Random rand = new Random();
		
		
		for(int i = 0; i < 100; i++) {
			numbers[i] = rand.nextInt(20);
			
		}
		System.out.println(Arrays.toString(numbers));
	}
	
	public int longest(int lastElement, int currentIndex) {
	
		if(currentIndex == numbers.length) {
			return 0;
		}
		
		int resultWithoutCurrent = longest(lastElement, currentIndex + 1);
		
		int resultWithCurrent = -1;
		if( numbers[currentIndex] > lastElement) {
			lastElement = numbers[currentIndex];
			resultWithCurrent = 1 + longest(lastElement, currentIndex + 1);
		}
		
		return Math.max(resultWithoutCurrent, resultWithCurrent);
		
		
	}
	
	public static void main(String[] args) {
		

		LIS2 lis =new LIS2();
		int result = lis.longest(Integer.MIN_VALUE, 0);
		
		System.out.println(result);
		
	}
}
