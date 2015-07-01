package sessionone;

import java.util.Scanner;

public class Palindrome {

	static String inputNumber = "";
	static Scanner scanner;

	public static void main(String a[]) {
		String checkCon = "";
		do {
			int[] intNumbers = getInputValues();
			if (isPalindrome(intNumbers)) {
				System.out.println(inputNumber + " is a palindrome");
			} else {
				System.out.println(inputNumber + " is not a palindrome");
			}

			System.out.println("Enter \'Y\' to continue....");
			scanner = new Scanner(System.in);
			if (scanner.hasNextLine()) {
				checkCon = scanner.next();
			}
			System.out.println(checkCon);
			System.out.println(checkCon.equals("Y"));

		} while (checkCon.equals("Y"));
		scanner.close();

	}

	/**
	 * Get the input values in the form of int array
	 * 
	 * @return
	 */
	public static int[] getInputValues() {
		System.out.println("Enter a number to find palindrome or not");

		scanner = new Scanner(System.in);
		if (scanner.hasNextLine()) {
			inputNumber = scanner.next();
		}
		int[] intNumbers = new int[inputNumber.length()];
		for (int i = 0; i < inputNumber.length(); i++) {
			if (Character.isDigit(inputNumber.charAt(i))) {
				intNumbers[i] = Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
			} else {
				System.out.println("Enter correct values");
				break;
			}
		}
		return intNumbers;
	}

	/**
	 * Check is number is type of Palindrome
	 */

	public static boolean isPalindrome(int[] intNumbers) {
		int lengthArr = intNumbers.length;
		System.out.println("Length of the array is " + lengthArr);
		int cenIndex = lengthArr / 2;
		int j = lengthArr - 1;

		for (int i = 0; i < cenIndex; i++) {
			do {
				if (intNumbers[i] == intNumbers[j]) {
					break;
				} else
					return false;
			} while (j > cenIndex);
			j--;
		}
		return true;
	}
}