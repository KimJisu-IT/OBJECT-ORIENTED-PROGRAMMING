package SharingP;

import SharingP.SharingUse;
import SharingP.Sharing;


public class SharingMain {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		
		SharingUse s= new SharingUse();
		
		s.sprint();
	}
}


// javac -d. SharingUse.java Sharing.java 
//  -> SharingP  디렉토리 생성, 그 밑에 해당 class 파일이 만들어짐.

// jar cvf SharingP.jar SharingP
//  -> 공유를 위한 jar 파일 생성

// jar 파일을 연동
//  -> javac ShringMain.java -classpath SharingP.jar

// 실행
//  -> SharingMain