import java.util.Date; 

public class HelloMewithDate { // HelloMewithDate 이름의 클래스 선언
	public static void main(String[] args) {  // 자바 프로그램의 시작 메소드(함수)
		String msg="Jisu Kim";  // 문자열 msg을 선언하고 "JiSu Kim"로 지정
		System.out.println("Hello World!");  // "Hello World"의 결과로 Hello World를 출력
		System.out.println("She is"+msg); // "She is "+ msg의 결과로 She is JiSu Kim을 출력
		Date	date = new Date();  // Date  객체를 생성
	
		
		System.out.println("Today: "+date);  // "Today: "+ date의 결과로 Today: Fri Mar 11 14:21:54 KST 2022을 출력
	}
}
