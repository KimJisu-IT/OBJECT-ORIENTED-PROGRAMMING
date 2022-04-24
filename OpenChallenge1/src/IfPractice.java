import  java.util.Scanner;
public class IfPractice {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		char grade;
		System.out.print("점수를 입력해주세요.");
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
		System.out.print("학점은"+grade+"입니다.");
		scanner.close();
	}
}
