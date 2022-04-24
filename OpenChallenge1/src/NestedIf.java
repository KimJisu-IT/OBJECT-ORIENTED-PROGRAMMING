import java.util.Scanner;
public class NestedIf {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("학년을 입력하세요.");
		int grade= scanner.nextInt();
		
		System.out.println("점수를 입력하세요.");
		int score= scanner.nextInt();
		
		if (grade==4) {
			if (score>=70)
				System.out.print("합격입니다.");
			else
				System.out.print("불합격입니다.");
			}
		else {
			if (score>=60)
				System.out.print("합격입니다.");
			else
				System.out.print("불합격입니다.");
		}
		
		scanner.close();
	}

}
