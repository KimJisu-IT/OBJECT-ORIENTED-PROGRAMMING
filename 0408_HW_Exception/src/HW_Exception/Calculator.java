package HW_Exception;
import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String menu= "";
		
		while(true) {
			System.out.println("*예외처리 계산기*");
			System.out.println("1. 덧셈");
			System.out.println("2. 뺄셈");
			System.out.println("3. 나눗셈");
			System.out.println("4. 예외 상황");
			System.out.println("선택 ->");
			
			menu = scan.nextLine();
			
			
			switch(menu) {
			case "1":// 덧셈
				add();
				break;
				
			case "2":// 뺄셈
				try {
					subManage();
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력하시오.");} catch (Exception e) {
                    System.out.println("숫자를 입력하시오.");					
				}
				break;
				
			case "3":// 나눗셈
				try {
					div();
				} catch (NumberFormatException e) {
					System.out.println("숫자를 입력하시오.");
				}
				break;
				
			case "4":
				try {
					makeException();
				} catch (MyException e) {
					System.out.println(e.getMessage());
					System.out.println("에러코드 : " + e.getErrCode());
				}
				break;
			default:
				break;
			}
		}
}
	
	
	private static void add() {
		int n1, n2, sum;
		String str;

		System.out.println("덧셈 연산");

		try {
			System.out.print("첫 번째 수 : ");
			str = scan.nextLine();
			n1 = Integer.parseInt(str);
			System.out.print("두 번째 수 : ");
			str = scan.nextLine();
			n2 = Integer.parseInt(str);

		 sum = n1 + n2;

		System.out.println("계산 결과 : " +  sum);
		} catch(Exception ne) {
			System.out.println("숫자를 입력해 주세요.");
		} finally {
			System.out.println("덧셈 연산이 끝났습니다.");
		}
	}//add 끝
	
	
	
	private static void sub() throws NumberFormatException, Exception {
		int n1, n2, sum;
		String str;

		System.out.println("뺄셈 연산");
		
			System.out.print("첫 번째 수 : ");
			str = scan.nextLine();
			n1 = Integer.parseInt(str);
			System.out.print("두 번째 수 : ");
			str = scan.nextLine();
			n2 = Integer.parseInt(str);

			sum = n1 - n2;

			System.out.println("계산 결과 : " + sum);
	}
    
    	public static void subManage() throws NumberFormatException, Exception{
		sub();		
	}
    	
    	
    	
    	private static void div() throws NumberFormatException{
    		int n1, n2, sum;
    		String str;

    		System.out.println("나눗셈 연산");
    		
    			System.out.print("첫 번째 수 : ");
    			str = scan.nextLine();
    			n1 = Integer.parseInt(str);
    			System.out.print("두 번째 수 : ");
    			str = scan.nextLine();
    			n2 = Integer.parseInt(str);
    			
    			try {
    				sum = n1 / n2;
    			} catch (ArithmeticException e) {
    				System.out.println("0으로 나눌 수 없습니다.");
    				sum = 0;
    			}
    			System.out.println("계산 결과 : " + sum);
    	}
    	
    	
    	private static void makeException() throws MyException{
    		MyException myexp =
    				new MyException("페이지를 찾을 수 없습니다.", 404);
    		
    		throw myexp;
    	}
}
	