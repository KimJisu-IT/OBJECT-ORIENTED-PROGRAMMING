// HW #1
public class MyArray {
	public static void main (String args[]) {
		int num = 4;
		for (int i = 0; i< num; i++) { 
			for (int j = 1; j< num-i; j++) {
				System.out.print(" ");  // 공백 출력
			} for (int j=0; j < i*2+1; j++) {
				System.out.print("*");  // 별 출력
			}System.out.println();  // 줄바꿈
		}
		for (int i=num-1; i >0 ;i--) {
			for (int j=num-i; j > 0; j--) {
				System.out.print(" "); // 공백 출력
			} for(int j=i*2-1; j>0;j--) {
				System.out.print("*");  // 별 출력
			}System.out.println();  // 줄바꿈
		}
	}

}
