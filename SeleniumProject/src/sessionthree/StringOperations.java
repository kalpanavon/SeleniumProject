package sessionthree;

public class StringOperations {

	public static void main(String[] args) {
		int charPosition = 2;
		char ch = 'r';
		String inputString = "Barking learning center";
		if (findCharAtPosition(inputString, ch, charPosition)) {
			System.out.println(ch + " found at " + charPosition);
		}else{
			System.out.println(ch + " not found at " + charPosition);
		}
	}
	//finds input char in string at particular position
	public static boolean findCharAtPosition(String inputString, char ch, int charPosition) {
		int count = 0;
		for (int i = 0; i < inputString.length(); i++) {
			if (inputString.charAt(i) == ch) {
				count++;
			}
			if (count == charPosition) {
				return true;
			}
		}
		return false;
	}

}
