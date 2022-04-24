
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
		Zpractice z = new Zpractice();	// Z를 인스턴스화시킨 객체 Z 생성
		Y y= z;		// Y y = new Z(); 와 같은 의미이므로, Z를 인스턴스화시킨 객체 Y 생성 (Z는 Y에 상속됨), y 변수는 z와 같다고 선언
		X x= z;		// X x = new Z(); 와 같은 의미이므로, Z를 인스턴스화시킨 객체 X 생성 (Y는 X에 상속됨), x 변수는 z와 같다고 선언
		z.print();	// 클래스 Z의 print 메소드 적용 > I am a Z 출력
		y.print();	// 클래스 Z의 print 메소드 적용 > I am a Z 출력
		super.print(); 
		play();		//Play..I am a Z
		super.play();	//Play..I am an X.
		//y.doZ();                  //컴파일 에러
		// super.super.print();			// 컴파일 에러
		
		System.out.println("\ni ="+i);	// 한 줄 띄어쓰기, i=15 출력
		System.out.println("this.i ="+this.i);	// this.i =30
		System.out.println("super.i ="+super.i);	//super.i =20
		System.out.println("y.i ="+y.i);	//y.i =20
		System.out.println("x.i ="+x.i);	//x.i =10
		System.out.println("((Y)this)i ="+((Y)this).i);	//((Y)this)i =20
		System.out.println("((X)this)i ="+((X)this).i);	//((X)this)i =10// Line 20으로 인해 슈퍼 클래스 Z의 print 메소드를 서브 클래스 Y에서 동일한 이름으로 자신의 특징에 맞게 구현(다형성- 오버라이딩) > I am an Y 출력
		// super.super.i=10;
	}
}