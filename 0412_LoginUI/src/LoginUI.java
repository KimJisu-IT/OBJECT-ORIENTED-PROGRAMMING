import java.awt.*;

public class LoginUI {
	Frame f;
	Label llg,lpw, lnote;
	TextField login, passwd;
	TextArea note;
	
	public LoginUI(String msg) {
		f= new Frame(msg);
		f.setLayout(new FlowLayout());
		
		
		
		
		
		// UI ���� Component�� ��ü ����
		llg= new Label("Login");
		lpw= new Label("Password");
		lnote= new Label("�ּ�");
		login= new TextField(50);
		passwd= new TextField(50);
		passwd.setEchoChar('*');
		note = new TextArea("�ּ��� �ټ���", 20, 50);
		// ������ Component ��ü�� ��ġ
		f.add(llg);
		f.add(login);
		f.add(lpw);
		f.add(passwd);
		f.add(lnote);
		f.add(note);
		
		f.setSize(500,300);
		f.setVisible(true);
	}
}
