package sessionone;

/**
 * To find given number is Prime or not
 *
 */
public class PrimeNumber {

	public static void main(String[] args) {
		int inputNumber = 98;
		if (isPrime(inputNumber)) {
			System.out.println(inputNumber + " is a Prime number");
		} else {
			System.out.println(inputNumber + " is not a Prime number");
		}

	}

	public static boolean isPrime(int inputNumber) {
		if (inputNumber == 1 || inputNumber == 2) {
			return true;
		} else if (inputNumber % 2 == 0) {
			return false;
		} else {
			return true;
		}
	}
}
