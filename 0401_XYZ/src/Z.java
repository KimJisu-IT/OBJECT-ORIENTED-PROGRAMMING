
public class Z extends Y{  // Y�� ��ӹ޴� ���� Ŭ���� Z ����
	int i = 30;		// int i�� 30���� ����
	String msg="I am a Z."; // ���ڿ� msg�� I am a Z�� ����
	
	void print() {	// �޼ҵ� print() ����
		System.out.println(msg);	// �޼ҵ� print()�� 'msg' ���
	}
	
	void play() {	// �޼ҵ� play() ����
		System.out.println("Play.."+msg);	// �޼ҵ� play()�� 'Play.. + msg' ���
	}
	
	void doZ() {	// �޼ҵ� doZ() ����
		System.out.println("do something in Z.");	// �޼ҵ� doZ()�� 'do something in Z' ���
	}
	
	void test(int i) {
		Z z = new Z();	// Z�� �ν��Ͻ�ȭ��Ų ��ü Z ����
		Y y= z;		// Y y = new Z(); �� ���� �ǹ��̹Ƿ�, Z�� �ν��Ͻ�ȭ��Ų ��ü Y ���� (Z�� Y�� ��ӵ�), y ������ z�� ���ٰ� ����
		X x= z;		// X x = new Z(); �� ���� �ǹ��̹Ƿ�, Z�� �ν��Ͻ�ȭ��Ų ��ü X ���� (Y�� X�� ��ӵ�), x ������ z�� ���ٰ� ����
		z.print();	// Ŭ���� Z�� print �޼ҵ� ���� > 'I am a Z' ���
		y.print();	// Ŭ���� Z�� print �޼ҵ� ���� > 'I am a Z' ���
		super.print(); //super �޼ҵ带 ����� ���� Ŭ������ Y�� �����ڸ� �����Ͽ� 'I am an Y.'�� ���
		play();		// 'Play..I am a Z' ���
		super.play();	//super �޼ҵ带 ����� ���� Ŭ������ X�� �����ڸ� �����Ͽ� 'Play..I am an X.'�� ���
		//y.doZ();          // doZ() �޼ҵ�� ���� Ŭ������ Z���� �����ϰ�, ���� Ŭ������ Y���� �������� �ʱ� ������ ������ ����
		// super.super.print();		// super.super.print(); ó�� super()�� �� �� �̻� ����ϰ� �Ǹ� ĸ��ȭ�� �����ϰ� �ǹǷ� ������ ������ �߻�

		
		System.out.println("\ni ="+i);	// �� �� ����, i=15 ���
		System.out.println("this.i ="+this.i);	// this.i =30
		System.out.println("super.i ="+super.i);	// super.i =20
		System.out.println("y.i ="+y.i);	//'y.i =20' ���
		System.out.println("x.i ="+x.i);	//'x.i =10' ���
		System.out.println("((Y)this)i ="+((Y)this).i);	//'((Y)this)i =20' ��� > ���� Ŭ������ print �޼ҵ带 ���� Ŭ�������� ������ �̸����� �ڽ��� Ư¡�� �°� ����(������- �������̵�)
		System.out.println("((X)this)i ="+((X)this).i);	//'((X)this)i =10' ��� > ���� Ŭ������ print �޼ҵ带 ���� Ŭ�������� ������ �̸����� �ڽ��� Ư¡�� �°� ����(������- �������̵�)
		// super.super.i=10;  // super.super.i=10; ó�� super()�� �� �� �̻� ����ϰ� �Ǹ� ĸ��ȭ�� �����ϰ� �ǹǷ� ������ ������ �߻�
	}
}






