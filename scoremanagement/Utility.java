package scoremanagement;

public class Utility {
	public static int validateInteger(int limit) {
		int value = 0;
		boolean flag = true;
		while (flag) {
			try {
				value = Integer.parseInt(Main.scanner.nextLine());
				if (0 <= value && value <= limit)
					flag = false;
			} catch (Exception e) {
				System.out.print("Enter valid number! : ");
			}
		}
		return value;
	}

}