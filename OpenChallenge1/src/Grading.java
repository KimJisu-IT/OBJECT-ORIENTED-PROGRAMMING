import java.util.Scanner;
public class Grading {
	public static void main(String[] args) {
		char grade;
		Scanner scanner=new Scanner(System.in);
		System.out.print("점수를 입력하세요.");
		
		int score= scanner.nextInt();
		
		if (score>=90)
			grade='A';
		else if (score >=80)
			grade='B';
		else
			grade='F';
		System.out.print(grade+"입니다.");
		scanner.close();		
	}

}
