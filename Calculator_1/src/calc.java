import java.util.Scanner;
//Это калькуляторчик для сложения, вычитания, умножения и деления двух целых чисел!!!

public class calc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите первое число: ");
		int num1 = sc.nextInt();
		System.out.println("Введите нужный вам знак (+, -, *, /): ");
		String sg = sc.next();
		System.out.println("Введите второе число: ");
		int num2 = sc.nextInt();
		if ( num2 == 0 ) {
			System.out.println("Division by zero is fobbiden! Please enter another humber! ");
			System.out.println("Введите второе число: ");
			num2 = sc.nextInt();
		}
		sc.close();
		System.out.println("Результат выражения равен:" + Signs.metodSigns(num1, sg, num2));
	}

}
