import java.awt.*;

public class LabelTest {
		// ������ 1
				LabelTest() {
					Frame f= new Frame("Label Test: KJS");
					Label l= new Label("IT Dept. Kim Ji Su");
					
					f.add(l);
					f.setSize(500,500);
					f.setVisible(true);
				}
				
				// ������ 2
				LabelTest(String title) {
					Frame f= new Frame(title);
					Label l= new Label("IT Dept. Kim Ji Su");
					
					f.add(l);
					f.setSize(500,500);
					f.setVisible(true);
				}
}