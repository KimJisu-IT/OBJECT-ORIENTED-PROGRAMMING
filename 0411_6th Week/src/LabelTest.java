import java.awt.*;

public class LabelTest {
		// 持失切 1
				LabelTest() {
					Frame f= new Frame("Label Test: KJS");
					Label l= new Label("IT Dept. Kim Ji Su");
					
					f.add(l);
					f.setSize(500,500);
					f.setVisible(true);
				}
				
				// 持失切 2
				LabelTest(String title) {
					Frame f= new Frame(title);
					Label l= new Label("IT Dept. Kim Ji Su");
					
					f.add(l);
					f.setSize(500,500);
					f.setVisible(true);
				}
}