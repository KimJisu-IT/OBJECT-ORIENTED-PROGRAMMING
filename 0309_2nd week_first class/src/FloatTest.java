// Lab 2-3(Float)
public class FloatTest {   // FloatTest �̸��� Ŭ���� ����
	public static void main(String[] args) {   // �ڹ� ���α׷��� ���� �޼ҵ�(�Լ�)
		int int1=7, int2=44;   // ������ ���� int1�� int2�� �����ϰ� ���� 7�� 44�� �ʱ�ȭ
		int int3, int4;   // ������ ���� int3, int4, int5�� ������.
		float float1, float2, float3;
		
		int3= int2*int1;   // int3�� int2*int1(=7*44)�� 1936
		//int4 = int2 / int1;
		float1= int2/ int1;  // float1�� int2/int1(=44/7)�� 6
		float2= (float)int2/int1;   // float2�� (float)int2/int1(=44/7)�� 6.285714
		float3= 44/ (float)int1;   // float3�� 44 / (float)int1�� 6.285714
		
		System.out.println("44 * 7= "+int3);   // "44 * 7= "+int3�� ����� 308�� ���
		//System.out.println("44/7 =" + int4);
		System.out.println("44 / 7= "+ float1);   // "44 / 7= "+float1�� ����� 6�� ���
		System.out.println("44 / 7= "+ float2);   // "44 / 7= "+float2�� ����� 6.285714�� ���
		System.out.println("44 / 7= "+ float3);   // "44 / 7= "+float3�� ����� 6.285714�� ���
	}

}
