import java.util.Scanner;
public class Won {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("��(��)�� �Է����ּ���");
		int won= scanner.nextInt();
		
		int dollar;
		dollar= won/1100;
		
		System.out.print(won+"�� ��"+dollar+"�޷� �Դϴ�.");
		
		
		scanner.close();
	}

}
