import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.List;
public class ListTestSingle {
	public ListTestSingle() {
		Frame f= new Frame("ListTest");
		
		f.setLayout(new FlowLayout());
		
		List list = new List(6, false);
		
		list.add("One");
		list.add("Two");
		list.add("Three");
		list.add("Four");
		list.add("Five");
		list.add("Six");
		
		f.add(list);
		f.setSize(300,200);
		f.setVisible(true);
	}
}
