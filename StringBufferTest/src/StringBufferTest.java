public class StringBufferTest { // StringBufferTest �̸��� Ŭ���� ����
	public static void main(String[] args) {  // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�)
		StringBuffer	buf=new StringBuffer();  // StringBuffer  ��ü�� ����
				
		buf.append("Hello ");  // append �޼ҵ带 �̿��� ���ڿ� Hello �߰�
		buf.append("JiSu Kim");  // append �޼ҵ带 �̿��� ���ڿ� JiSu Kim �߰�
		
		System.out.println(buf.toString());  // toString() �޼ҵ带 �̿��� ��ü�� ������ �ִ� ������ ���ڿ��� ����� ����
	}

}
