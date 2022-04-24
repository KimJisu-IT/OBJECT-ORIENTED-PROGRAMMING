// Exception Handling: Lab
package Exception;

public class BalanceOutOfException extends Exception {
	public BalanceOutOfBoundsException() {
		super("잔액을 초과하였습니다.");
	}
}
