import  java.util.Scanner;
public class IfPractice {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		char grade;
		System.out.print("������ �Է����ּ���.");
		int score= scanner.nextInt();
		
		if (score>=90) {
			grade='A';
		}
		else if (score>=80)
			grade='B';
		else if (score>=70)
			grade='c';
		else
			grade='F';
		System.out.print("������"+grade+"�Դϴ�.");
		scanner.close();
	}
}
