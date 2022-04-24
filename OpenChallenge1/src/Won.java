import java.util.Scanner;
public class Won {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		System.out.print("돈(원)을 입력해주세요");
		int won= scanner.nextInt();
		
		int dollar;
		dollar= won/1100;
		
		System.out.print(won+"원 은"+dollar+"달러 입니다.");
		
		
		scanner.close();
	}

}
