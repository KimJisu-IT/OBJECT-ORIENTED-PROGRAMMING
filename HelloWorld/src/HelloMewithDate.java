import java.util.Date; 

public class HelloMewithDate { // HelloMewithDate �̸��� Ŭ���� ����
	public static void main(String[] args) {  // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�)
		String msg="Jisu Kim";  // ���ڿ� msg�� �����ϰ� "JiSu Kim"�� ����
		System.out.println("Hello World!");  // "Hello World"�� ����� Hello World�� ���
		System.out.println("She is"+msg); // "She is "+ msg�� ����� She is JiSu Kim�� ���
		Date	date = new Date();  // Date  ��ü�� ����
	
		
		System.out.println("Today: "+date);  // "Today: "+ date�� ����� Today: Fri Mar 11 14:21:54 KST 2022�� ���
	}
}
