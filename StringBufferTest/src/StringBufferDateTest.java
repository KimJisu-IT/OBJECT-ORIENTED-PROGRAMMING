import java.util.Date;

class StringBufferDateTest {  // StringBufferDateTest �̸��� Ŭ���� ����
	public static void main(String[] args) {  // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�
		StringBuffer	buf=new StringBuffer();  // StringBuffer  ��ü�� ����
		
		buf.append("Hello!! ");// append �޼ҵ带 �̿��� ���ڿ� Hello �߰�
		buf.append("JiSu Kim");  // append �޼ҵ带 �̿��� ���ڿ� JiSu Kim �߰�
		
		System.out.println(buf.toString()); // toString() �޼ҵ带 �̿��� ��ü�� ������ �ִ� ������ ���ڿ��� ����� ����
		
		Date date= new Date(); // Date  ��ü�� ����
		buf.append(date);// append �޼ҵ带 �̿��� ��ü date�� �߰�
		System.out.println(buf.toString());// toString() �޼ҵ带 �̿��� ��ü�� ������ �ִ� ������ ���ڿ��� ����� ����
	}

}
