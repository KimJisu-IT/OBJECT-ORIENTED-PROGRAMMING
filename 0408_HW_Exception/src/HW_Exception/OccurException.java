package HW_Exception;

import java.util.Scanner;
import HW_Exception.Info;

public class OccurException {
	static Info info = new Info();
	
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("이름: ");
		info.setName(scan.nextLine());
		System.out.print("정보: ");
		info.setInfo(scan.nextLine());
	}
}
