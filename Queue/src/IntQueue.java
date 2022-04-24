
public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	// ���� �� ����: ť�� ��� ����
	public class OverflowIntException{
		public EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
	}
	
	// ���� �� ����: ť�� ���� ��
	public class OverflowIntException{
		public EmptyIntQueueException extends RuntimeException{
			public OverIntQueueException() {}
		}
	}
	
	// ������
	public IntQueue(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max]; // ť ��ü�� �迭�� ����
		}catch (OutOfMemoryError e) {  //������ �� ����
			max =0;
		}
	}
}
