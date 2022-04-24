import java.awt.*;

public class MyLoginUI {
	Frame f;
	
	Label llg,lpw, lnote;
	TextField login, passwd;
	TextArea note;
	
	
	
	
	public MyLoginUI(String msg) {
		f= new Frame(msg);
		f.setLayout(new FlowLayout());	
		
		
		// UI ���� Component�� ��ü ����	
		Button a= new Button("Press");
		Button b= new Button("OK");
	
		llg= new Label("Login");
		lpw= new Label("Password");
		login= new TextField(50);
		passwd= new TextField(50);
		passwd.setEchoChar('*');
		
		// ������ Component ��ü�� ��ġ
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(a);
		f.add(b);
		
		f.setSize(400,200);
		f.setVisible(true);
		f.setResizable(false);
	}
}
