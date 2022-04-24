import java.util.Scanner;
public class CodeIt {
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.print("예제 입력");
		
		int num= scanner.nextInt();
		
		int hun, ten, one, n=0;
		
		while (num==0) {
			hun=num%1;
			ten=num%10;
			one=num%100;
			
			n=hun+ten+num;
		}
		if (num ==0)
			System.out.print(n);
		
		scanner.close();
	}

}
