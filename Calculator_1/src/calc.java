import java.util.Scanner;
//��� �������������� ��� ��������, ���������, ��������� � ������� ���� ����� �����!!!
public class calc
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("������� ������ �����: ");
		int num1 = sc.nextInt();
		System.out.println("������� ������ ��� ���� (+, -, *, /): ");
		String sg = sc.next();
		System.out.println("������� ������ �����: ");
		int num2 = sc.nextInt();
		sc.close();
      System.out.println("��������� ��������� �����:" + Signs.metodSigns(num1, sg, num2));  
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


