//Lab 2-4
public class MultiDarray { // MultiDarray �̸��� Ŭ���� ����
	public static void main(String args[]) {   // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�)
	
	char stars[][];  // 2���� �迭 ����
	
	char sign[]= new char[3];  // �� ���� �迭 ����
	
	sign[0]='K';
	sign[1]='J';
	sign[2]='S';
	
	stars=new char[6][];
	for(int i=0; i<stars.length;i++) {  // �࿡ ���� �ݺ�
		stars[i]=new char[i+1];
		for (int j=0; j< stars[i].length;j++) {  // ���� ���� �ݺ�
			stars[i][j]='*';
			System.out.print(stars[i][j]);
		}
		System.out.println();  // ���� �ٷ� �Ѿ��
	}
	System.out.print((char)sign[0]);
	System.out.print((char)sign[1]);
	System.out.println((char)sign[2]);
	}
}
