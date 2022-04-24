import java.util.Date;

class StringBufferDateTest {  // StringBufferDateTest 이름의 클래스 선언
	public static void main(String[] args) {  // 자바 프로그램의 시작 메소드(함수
		StringBuffer	buf=new StringBuffer();  // StringBuffer  객체를 생성
		
		buf.append("Hello!! ");// append 메소드를 이용해 문자열 Hello 추가
		buf.append("JiSu Kim");  // append 메소드를 이용해 문자열 JiSu Kim 추가
		
		System.out.println(buf.toString()); // toString() 메소드를 이용해 객체가 가지고 있는 정보를 문자열로 만들어 리턴
		
		Date date= new Date(); // Date  객체를 생성
		buf.append(date);// append 메소드를 이용해 객체 date를 추가
		System.out.println(buf.toString());// toString() 메소드를 이용해 객체가 가지고 있는 정보를 문자열로 만들어 리턴
	}

}
