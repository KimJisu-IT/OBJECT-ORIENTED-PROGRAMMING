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
//  -> SharingP  ���丮 ����, �� �ؿ� �ش� class ������ �������.

// jar cvf SharingP.jar SharingP
//  -> ������ ���� jar ���� ����

// jar ������ ����
//  -> javac ShringMain.java -classpath SharingP.jar

// ����
//  -> SharingMain