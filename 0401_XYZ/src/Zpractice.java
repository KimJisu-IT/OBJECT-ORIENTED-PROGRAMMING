
public class Zpractice extends Y{
	int i = 30;
	String msg="I am a Z.";
	
	void print() {
		System.out.println(msg);
	}
	
	void play() {
		System.out.println("Play.."+msg);
	}
	
	void doZ() {
		System.out.println("do something in Z.");
	}
	
	void test(int i) {
		Zpractice z = new Zpractice();	// Z�� �ν��Ͻ�ȭ��Ų ��ü Z ����
		Y y= z;		// Y y = new Z(); �� ���� �ǹ��̹Ƿ�, Z�� �ν��Ͻ�ȭ��Ų ��ü Y ���� (Z�� Y�� ��ӵ�), y ������ z�� ���ٰ� ����
		X x= z;		// X x = new Z(); �� ���� �ǹ��̹Ƿ�, Z�� �ν��Ͻ�ȭ��Ų ��ü X ���� (Y�� X�� ��ӵ�), x ������ z�� ���ٰ� ����
		z.print();	// Ŭ���� Z�� print �޼ҵ� ���� > I am a Z ���
		y.print();	// Ŭ���� Z�� print �޼ҵ� ���� > I am a Z ���
		super.print(); 
		play();		//Play..I am a Z
		super.play();	//Play..I am an X.
		//y.doZ();                  //������ ����
		// super.super.print();			// ������ ����
		
		System.out.println("\ni ="+i);	// �� �� ����, i=15 ���
		System.out.println("this.i ="+this.i);	// this.i =30
		System.out.println("super.i ="+super.i);	//super.i =20
		System.out.println("y.i ="+y.i);	//y.i =20
		System.out.println("x.i ="+x.i);	//x.i =10
		System.out.println("((Y)this)i ="+((Y)this).i);	//((Y)this)i =20
		System.out.println("((X)this)i ="+((X)this).i);	//((X)this)i =10// Line 20���� ���� ���� Ŭ���� Z�� print �޼ҵ带 ���� Ŭ���� Y���� ������ �̸����� �ڽ��� Ư¡�� �°� ����(������- �������̵�) > I am an Y ���
		// super.super.i=10;
	}
}