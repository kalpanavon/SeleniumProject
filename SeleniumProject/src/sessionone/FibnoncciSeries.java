package sessionone;

import java.util.Scanner;

/*
 * print fibnoncci series
 */
public class FibnoncciSeries {
	static Scanner scanner;

	public static void main(String[] args) {
		int inputNumber = 0;
		System.out.println("Enter number to print fibnoncci series !!!!!!!!!!");
		scanner = new Scanner(System.in);
		if (scanner.hasNextInt()) {
			inputNumber = scanner.nextInt();
		} else {
			System.out.print("Enter integer value");
		}
		for (int i = 0; i <= inputNumber; i++) {
			System.out.print(getFibnoncciNumber(i) + " ");
			//System.out.print(getFibnoncciNum(i) + " ");
		}
		scanner.close();
	}

	private static int getFibnoncciNumber(int presNumber) {
		if (presNumber == 0) {
			return 0;
		} else if (presNumber == 1 || presNumber == 2) {
			return 1;
		} else {
			return (getFibnoncciNumber(presNumber - 1) + getFibnoncciNumber(presNumber - 2));
		}
	}

	/**
	 * Logic without recursion
	 */
	private static int getFibnoncciNum(int presNumber) {
		if (presNumber == 0) {
			return 0;
		} else if (presNumber == 1 || presNumber == 2) {
			return 1;
		} else {
			int firstFb = 1, secFb = 1, finalFb = 1;
			for(int i=3; i<=presNumber;i++){
				finalFb = firstFb + secFb;
				firstFb=secFb;
				secFb=finalFb;
			}
			return finalFb;
		}
	}
}
