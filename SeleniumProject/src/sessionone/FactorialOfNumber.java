package sessionone;

import java.util.Scanner;
/*
 * To Get factorial of a number, n*(n-1), when n=0 then fact is 1)
 */

public class FactorialOfNumber {
	static Scanner scanner;

	public static void main(String s[]) {
		int inputNumber = 0;
		System.out.println("Enter number to print factorial of that number !!!!!!!!!!");
		scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			inputNumber = scanner.nextInt();
		} else {
			System.out.print("Enter integer value");
		}
		printFactorial(findFactorials(inputNumber));
	}

	private static int[] findFactorials(int inputNumber) {
		int[] factorials = new int[inputNumber];
		for(int i = inputNumber; i>=1; i--){
			factorials[i-1]= i;
		}
		return factorials;
	}
	
	private static void printFactorial(int[] factorials){
		int totalFact = 1;
		StringBuilder sb = new StringBuilder();
		for(int i=factorials.length-1;i>=0; i--){
			totalFact = totalFact*factorials[i];
			sb.append(factorials[i]+"*");
		}
		sb.append("=");
		sb.append(totalFact);
		System.out.println(sb.toString());
	}
}
