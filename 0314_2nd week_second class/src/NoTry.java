// Lab 2-6-1  #NoTry
public class NoTry {
	public static void main (String[] args) {
		String msg[]= {"Kim","Ji","Su"};
		int n= msg.length;
		
		for (int i=0; i<= n;i++) {  //for (int i=0; i< n;i++)으로 수정하면 Line 10이 실행된다.
			System.out.println(msg[i]);
		}
		System.out.println("Program is done.");
	}

}
