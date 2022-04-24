// 3.2 Class: Lab 1-4(Package) #PenUser4
package PenP;

public class PenUser4 {
	public static void main(String[] args) {
		System.out.println("Hello Pen!");
		
		Pen4 mypen= new Pen4("SMU", "GREEN",1000);
		
		mypen.erase();
		mypen.write();
		mypen.write();
		mypen.write(2000);
		mypen.write(3000,"Dept. IT Engineering");
	}

}
