package HW_Exception;
import java.util.Scanner;

public class Calculator {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		
		String menu= "";
		
		while(true) {
			System.out.println("*����ó�� ����*");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ������");
			System.out.println("4. ���� ��Ȳ");
			System.out.println("���� ->");
			
			menu = scan.nextLine();
			
			
			switch(menu) {
			case "1":// ����
				add();
				break;
				
			case "2":// ����
				try {
					subManage();
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��Ͻÿ�.");} catch (Exception e) {
                    System.out.println("���ڸ� �Է��Ͻÿ�.");					
				}
				break;
				
			case "3":// ������
				try {
					div();
				} catch (NumberFormatException e) {
					System.out.println("���ڸ� �Է��Ͻÿ�.");
				}
				break;
				
			case "4":
				try {
					makeException();
				} catch (MyException e) {
					System.out.println(e.getMessage());
					System.out.println("�����ڵ� : " + e.getErrCode());
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

		System.out.println("���� ����");

		try {
			System.out.print("ù ��° �� : ");
			str = scan.nextLine();
			n1 = Integer.parseInt(str);
			System.out.print("�� ��° �� : ");
			str = scan.nextLine();
			n2 = Integer.parseInt(str);

		 sum = n1 + n2;

		System.out.println("��� ��� : " +  sum);
		} catch(Exception ne) {
			System.out.println("���ڸ� �Է��� �ּ���.");
		} finally {
			System.out.println("���� ������ �������ϴ�.");
		}
	}//add ��
	
	
	
	private static void sub() throws NumberFormatException, Exception {
		int n1, n2, sum;
		String str;

		System.out.println("���� ����");
		
			System.out.print("ù ��° �� : ");
			str = scan.nextLine();
			n1 = Integer.parseInt(str);
			System.out.print("�� ��° �� : ");
			str = scan.nextLine();
			n2 = Integer.parseInt(str);

			sum = n1 - n2;

			System.out.println("��� ��� : " + sum);
	}
    
    	public static void subManage() throws NumberFormatException, Exception{
		sub();		
	}
    	
    	
    	
    	private static void div() throws NumberFormatException{
    		int n1, n2, sum;
    		String str;

    		System.out.println("������ ����");
    		
    			System.out.print("ù ��° �� : ");
    			str = scan.nextLine();
    			n1 = Integer.parseInt(str);
    			System.out.print("�� ��° �� : ");
    			str = scan.nextLine();
    			n2 = Integer.parseInt(str);
    			
    			try {
    				sum = n1 / n2;
    			} catch (ArithmeticException e) {
    				System.out.println("0���� ���� �� �����ϴ�.");
    				sum = 0;
    			}
    			System.out.println("��� ��� : " + sum);
    	}
    	
    	
    	private static void makeException() throws MyException{
    		MyException myexp =
    				new MyException("�������� ã�� �� �����ϴ�.", 404);
    		
    		throw myexp;
    	}
}
	