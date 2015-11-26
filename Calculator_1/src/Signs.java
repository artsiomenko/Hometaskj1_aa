public class Signs {

		public static int metodSigns(int num1, String sg, int num2) {
			int result = 0;
			switch (sg) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				result = num1 / num2;
				break;
			}
			return result;
		}
	}
