import java.awt.*;

public class LoginUI {
	Frame f;
	Label llg,lpw, lnote;
	TextField login, passwd;
	TextArea note;
	
	public LoginUI(String msg) {
		f= new Frame(msg);
		f.setLayout(new FlowLayout());
		
		
		
		
		
		// UI 包访 Component狼 按眉 积己
		llg= new Label("Login");
		lpw= new Label("Password");
		lnote= new Label("林籍");
		login= new TextField(50);
		passwd= new TextField(50);
		passwd.setEchoChar('*');
		note = new TextArea("林籍阑 促技夸", 20, 50);
		// 积己等 Component 按眉狼 硅摹
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
