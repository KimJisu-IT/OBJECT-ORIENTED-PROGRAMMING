//Lab 2-4
public class MultiDarray { // MultiDarray 이름의 클래스 선언
	public static void main(String args[]) {   // 자바 프로그램의 시작 메소드(함수)
	
	char stars[][];  // 2차원 배열 선언
	
	char sign[]= new char[3];  // 각 행의 배열 생성
	
	sign[0]='K';
	sign[1]='J';
	sign[2]='S';
	
	stars=new char[6][];
	for(int i=0; i<stars.length;i++) {  // 행에 대한 반복
		stars[i]=new char[i+1];
		for (int j=0; j< stars[i].length;j++) {  // 열에 대한 반복
			stars[i][j]='*';
			System.out.print(stars[i][j]);
		}
		System.out.println();  // 다음 줄로 넘어가기
	}
	System.out.print((char)sign[0]);
	System.out.print((char)sign[1]);
	System.out.println((char)sign[2]);
	}
}
