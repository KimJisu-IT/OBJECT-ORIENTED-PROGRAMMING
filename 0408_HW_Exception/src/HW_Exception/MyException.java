package HW_Exception;

class MyException extends Exception{
	private final int ERR_CODE;
	
	public MyException(String msg, int eCode) {
		super(msg);
		ERR_CODE = eCode;
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
}
