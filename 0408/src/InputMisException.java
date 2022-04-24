import java.util.Scanner;
import java.util.InputMismatchException;

public class InputMisException {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("***5개의 양수를 입력받아 합을 구하는 프로그램***");
		System.out.println("정수 5개를 입력하세요.");
		int sum=0, n=0;
		for(int i=0; i<5; i++) {
			System.out.print(i+1+"번째 숫자"+"->");
			try {
				n= scanner.nextInt();
			} catch(IntputMismatchException e) {
				System.out.println("정수가 아닙니다. 정수를 입력해주세요.");
				scanner.nextLine();
				i--;
				continue;
			}
			sum += n;
		}
		System.out.println("합은"+sum);
		scanner.close();
	}
}
