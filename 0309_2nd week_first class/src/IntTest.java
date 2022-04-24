// Lab 2-3(Integer)
public class IntTest {   // IntTest 이름의 클래스 선언
	public static void main(String[] args) {   // 자바 프로그램의 시작 메소드(함수)
		int int1=7, int2=44;   // 정수형 변수 int1과 int2를 선언하고 각각 7과 44로 초기화
		int int3, int4, int5;   // 정수형 변수 int3, int4, int5를 선언함.
		
		int3= int2*int1;   // int3은 int2*int1(=7*44)로 1936
		int4=int2/int1;   // int3은 int2/int1(=44/7)로 6
		int5 = 44/int1;   // int3은 44/int1(=44/7)로 6
		
		System.out.println("44 * 7= "+int3);   // "44 * 7= "+int3의 결과로 308을 출력
		System.out.println("44 / 7= "+int4);   // "44 / 7= "+int4의 결과로 6을 출력
		System.out.println("44 / 7= "+int5);   // "44 / 7= "+int5의 결과로 6을 출력
	}

}
