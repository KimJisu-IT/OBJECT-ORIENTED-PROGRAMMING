package HW_Exception;

import java.util.Scanner;
import HW_Exception.Info;

public class OccurException {
	static Info info = new Info();
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("�̸�: ");
		info.setName(scan.nextLine());
		System.out.print("����: ");
		info.setInfo(scan.nextLine());
	}
}
