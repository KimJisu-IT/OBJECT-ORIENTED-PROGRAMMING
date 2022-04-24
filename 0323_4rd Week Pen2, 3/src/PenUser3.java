// 3.2 Class: Lab 1-3 (Overloading) #PenUser3
public class PenUser3 {
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		Pen3 mypenl= new Pen3();
		mypenl.write();
		mypenl.write(10000); // price
		mypenl.write(1000,"RED");  // price, color
		
		Pen3 mypen2= new Pen3("IT공학과");
		mypen2.write();
		mypen2.write(20000); // price
		mypen2.write(2000,"SMU2");  // price, colormypenl.write
		
		Pen3 mypen3= new Pen3("IT 공학과", "노란색", 30000);
		mypen3.write();
		mypen3.write(20000); //price
		mypen3.write(3000, "SMU3"); //price, Vender
		mypen3.write(3000,"SMU3","Yello"); // price, Vender, color
	}
		
}
