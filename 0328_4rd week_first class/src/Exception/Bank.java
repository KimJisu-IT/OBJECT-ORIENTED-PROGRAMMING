// Exception Handling: Lab
package Exception;

public class Bank {
	public static void main(String args[]) {
		Account hong = new Account ("홍길동");
		hong.deposit(20);
		// hond.deposit(-100);	//MalformeData 예외 발생
		try {
			hong.withdraw(15);
		}catch (BalanceOutOfBoundsException be) {
			be.printStackTrace();
		}catch (MalformedData me) {
			me.printStackTrace();
		}
		hong.check();
		
		try {
			hong.withdraw(10);
		}catch (MalformedData be) {
			be.printStackTrace();
		}
		System.out.println("normal termination");
	}
}
