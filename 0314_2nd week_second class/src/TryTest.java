// Lab 2-6-2  #TryTest
public class TryTest {
	public static void main (String[] args) {
		String msg[]= {"Kim","Ji","Su"};
		int n= msg.length;
		
		for (int i=0; i<= n;i++) {
			try {
				System.out.println(msg[i]);
		}	catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("[Log] Array index error is occured. Oops, sorry. There is an exception.");
		}
	}System.out.println("Program is done.");
  }
}
