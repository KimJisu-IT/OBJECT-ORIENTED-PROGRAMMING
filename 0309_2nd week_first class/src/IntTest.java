// Lab 2-3(Integer)
public class IntTest {   // IntTest �̸��� Ŭ���� ����
	public static void main(String[] args) {   // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�)
		int int1=7, int2=44;   // ������ ���� int1�� int2�� �����ϰ� ���� 7�� 44�� �ʱ�ȭ
		int int3, int4, int5;   // ������ ���� int3, int4, int5�� ������.
		
		int3= int2*int1;   // int3�� int2*int1(=7*44)�� 1936
		int4=int2/int1;   // int3�� int2/int1(=44/7)�� 6
		int5 = 44/int1;   // int3�� 44/int1(=44/7)�� 6
		
		System.out.println("44 * 7= "+int3);   // "44 * 7= "+int3�� ����� 308�� ���
		System.out.println("44 / 7= "+int4);   // "44 / 7= "+int4�� ����� 6�� ���
		System.out.println("44 / 7= "+int5);   // "44 / 7= "+int5�� ����� 6�� ���
	}

}
