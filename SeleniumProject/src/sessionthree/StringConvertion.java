package sessionthree;

public class StringConvertion {

	public static void main(String[] args) {
		String itemPrice = "100";
		double discount = 0.08;// 8% discount
		int price = convertToInt(itemPrice);
		if (price > 0) {
			double priceAfterDisc = price - (price * discount);
			System.out.println("Item price after discount is " + priceAfterDisc);
		}
	}

	public static int convertToInt(String stringVal) {
		int intVal = 0;
		// check for int value in input to avoid Number format exception
		if (stringVal != null && stringVal.length() > 0 && stringVal.matches("-?\\d+")) {
			intVal = Integer.parseInt(stringVal);
		} else {
			System.out.println("Check input value.....provide int value");
		}
		return intVal;
	}

}
