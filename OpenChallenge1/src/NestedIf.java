import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("�г��� �Է��ϼ���.");
		int grade= scanner.nextInt();
		
		System.out.println("������ �Է��ϼ���.");
		int score= scanner.nextInt();
		
		if (grade==4) {
			if (score>=70)
				System.out.print("�հ��Դϴ�.");
			else
				System.out.print("���հ��Դϴ�.");
			}
		else {
			if (score>=60)
				System.out.print("�հ��Դϴ�.");
			else
				System.out.print("���հ��Դϴ�.");
		}
		
		scanner.close();
	}

}
