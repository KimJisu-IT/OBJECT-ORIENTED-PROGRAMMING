import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMisException {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("***5���� ����� �Է¹޾� ���� ���ϴ� ���α׷�***");
		System.out.println("���� 5���� �Է��ϼ���.");
		int sum=0, n=0;
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"��° ����"+"->");
			try {
				n= scanner.nextInt();
			} catch(IntputMismatchException e) {
				System.out.println("������ �ƴմϴ�. ������ �Է����ּ���.");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("����"+sum);
		scanner.close();
	}
}
