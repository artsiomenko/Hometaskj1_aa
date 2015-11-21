import java.util.Scanner;
//Ёто калькул€торчик дл€ сложени€, вычитани€, умножени€ и делени€ двух целых чисел!!!
public class calc
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите первое число: ");
		int num1 = sc.nextInt();
		System.out.println("¬ведите нужный вам знак (+, -, *, /): ");
		String sg = sc.next();
		System.out.println("¬ведите второе число: ");
		int num2 = sc.nextInt();
		sc.close();
      System.out.println("–езультат выражени€ равен:" + Signs.metodSigns(num1, sg, num2));  
	}

}
class Signs
{
	public static int metodSigns(int num1, String sg, int num2)
	{
		int eq = 0;
		switch (sg)
		{
		case "+": eq= num1 + num2;
		break;
		case "-": eq= num1 - num2;
		break;
		case "*": eq= num1 * num2;
		break;
		case "/": eq= num1 / num2;
		break;
		}
		return eq;
	}
}


