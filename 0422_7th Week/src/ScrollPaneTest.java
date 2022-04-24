import java.awt.*;
public class ScrollPaneTest {
	ScrollPane sp;
	Panel	panel;
	
	public ScrollPaneTest() {
		Frame f= new Frame("ScrolPaneTest");
		
		sp= new ScrollPane();
		sp.setSize(150,100);
		
		panel= new Panel();
		panel.setSize(500,450);
		panel.setLayout(new BorderLayout());
		panel.add("Center", new TextArea());
		Panel bottom= new Panel();
		bottom.add(new Button("OK"));
		bottom.add(new Button("CANCEL"));
		panel.add("South", bottom);
		
		sp.add(panel);
		f.add("Center", sp);
		f.add("Center", sp);
		f.setSize(200,300);
		f.setVisible(true);
		
		
	}
	
}
