
public class IntQueue {
	private int max;
	private int front;
	private int rear;
	private int num;
	private int[] que;
	
	// 실행 시 예외: 큐가 비어 있음
	public class OverflowIntException{
		public EmptyIntQueueException extends RuntimeException{
			public EmptyIntQueueException() {}
		}
	}
	
	// 실행 시 예외: 큐가 가득 참
	public class OverflowIntException{
		public EmptyIntQueueException extends RuntimeException{
			public OverIntQueueException() {}
		}
	}
	
	// 생성자
	public IntQueue(int capacity) {
		num=front=rear=0;
		max=capacity;
		try {
			que=new int[max]; // 큐 본체용 배열을 생성
		}catch (OutOfMemoryError e) {  //생성할 수 없음
			max =0;
		}
	}
}
