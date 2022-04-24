
public class Z extends Y{  // Y를 상속받는 서브 클래스 Z 선언
	int i = 30;		// int i를 30으로 정의
	String msg="I am a Z."; // 문자열 msg를 I am a Z로 정의
	
	void print() {	// 메소드 print() 정의
		System.out.println(msg);	// 메소드 print()로 'msg' 출력
	}
	
	void play() {	// 메소드 play() 정의
		System.out.println("Play.."+msg);	// 메소드 play()로 'Play.. + msg' 출력
	}
	
	void doZ() {	// 메소드 doZ() 정의
		System.out.println("do something in Z.");	// 메소드 doZ()로 'do something in Z' 출력
	}
	
	void test(int i) {
		Z z = new Z();	// Z를 인스턴스화시킨 객체 Z 생성
		Y y= z;		// Y y = new Z(); 와 같은 의미이므로, Z를 인스턴스화시킨 객체 Y 생성 (Z는 Y에 상속됨), y 변수는 z와 같다고 선언
		X x= z;		// X x = new Z(); 와 같은 의미이므로, Z를 인스턴스화시킨 객체 X 생성 (Y는 X에 상속됨), x 변수는 z와 같다고 선언
		z.print();	// 클래스 Z의 print 메소드 적용 > 'I am a Z' 출력
		y.print();	// 클래스 Z의 print 메소드 적용 > 'I am a Z' 출력
		super.print(); //super 메소드를 사용해 슈퍼 클래스인 Y의 생성자를 선택하여 'I am an Y.'가 출력
		play();		// 'Play..I am a Z' 출력
		super.play();	//super 메소드를 사용해 슈퍼 클래스인 X의 생성자를 선택하여 'Play..I am an X.'가 출력
		//y.doZ();          // doZ() 메소드는 서브 클래스인 Z에만 존재하고, 슈퍼 클래스인 Y에는 존재하지 않기 때문에 컴파일 에러
		// super.super.print();		// super.super.print(); 처럼 super()를 두 번 이상 사용하게 되면 캡슐화를 위반하게 되므로 컴파일 에러가 발생

		
		System.out.println("\ni ="+i);	// 한 줄 띄어쓰기, i=15 출력
		System.out.println("this.i ="+this.i);	// this.i =30
		System.out.println("super.i ="+super.i);	// super.i =20
		System.out.println("y.i ="+y.i);	//'y.i =20' 출력
		System.out.println("x.i ="+x.i);	//'x.i =10' 출력
		System.out.println("((Y)this)i ="+((Y)this).i);	//'((Y)this)i =20' 출력 > 슈퍼 클래스의 print 메소드를 서브 클래스에서 동일한 이름으로 자신의 특징에 맞게 구현(다형성- 오버라이딩)
		System.out.println("((X)this)i ="+((X)this).i);	//'((X)this)i =10' 출력 > 슈퍼 클래스의 print 메소드를 서브 클래스에서 동일한 이름으로 자신의 특징에 맞게 구현(다형성- 오버라이딩)
		// super.super.i=10;  // super.super.i=10; 처럼 super()를 두 번 이상 사용하게 되면 캡슐화를 위반하게 되므로 컴파일 에러가 발생
	}
}






