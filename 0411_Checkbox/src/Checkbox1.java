import java.awt.*;

public class Checkbox1 {
	Checkbox one;
	Checkbox two;
	Checkbox three;
	
	public Checkbox1() {
		Frame f= new Frame("CheckboxTest1");
		
		f.setLayout(new FlowLayout());
		
		Checkbox one= new Checkbox("One");
		Checkbox two= new Checkbox("Two");
		Checkbox three= new Checkbox("Three");
		
		f.add(one);
		f.add(two);
		f.add(three);

		
		f.setSize(300,200);
		f.setVisible(true);
	}
	
	public Checkbox1(String title) {
		Frame f= new Frame(title);
		
		f.setLayout(new FlowLayout());
		
		one= new Checkbox("One");
		two= new Checkbox("Two");
		three= new Checkbox("Three");
		
		f.add(one);
		f.add(two);
		f.add(three);
		
		f.setSize(300,200);
		f.setVisible(true);
	}
}