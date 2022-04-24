import java.awt.*;
import java.awt.event.*;

public class PopupTest extends Frame implements ActionListener {  //Event ó�� interface ���
	PopupMenu popup;
	Frame f;
	Button b;
	Menu col;
	public PopupTest() {
		f= new Frame("Popup Test");
		popup= new PopupMenu("Pop-up");
		b= new Button("POPUPTEST");
		b.addActionListener(this);  // Event�� ���� �غ�
		
		popup= new PopupMenu("POP-UP");
		popup.add(new MenuItem("copy"));
		popup.add(new MenuItem("paste"));
		col = new Menu("color");
		col.add(new MenuItem("white"));
		col.add(new MenuItem("blue"));
		popup.add(col);
		b.add(popup);
		f.add("Center", b);
		f.setSize(300,200);
		f.setVisible(true);
	}
	
	// implementation for ActionListener
	// overriding for methods that defined in ActionListener interface
	public void actionPerformed(ActionEvent e) {  // Event ����
		popup.show(b,10,10);
	}
}
