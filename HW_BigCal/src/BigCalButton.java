
import java.awt.*;


public class BigCalButton extends Frame {
	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9;
	private Button bpm,bm, bdot, bp, bmulti, bd, bc, bce, bdel, bbr, bpercent, bx, bequal;
	private TextField tf;
   // 계산기에서 사용할 버튼과 텍스트 필드 객체 선언
   
	GridBagConstraints cc;
	Panel board;
   
	public BigCalButton() {
		super("Simple Cal with GridLayout");
		GridBagLayout gridbag = new GridBagLayout();
		cc = new GridBagConstraints();
		cc.weightx = 1.0;
		cc.weighty = 1.0;
		cc.fill = GridBagConstraints.BOTH;
		b0 = new Button("0");
		b1 = new Button("1");
		b2 = new Button("2");
		b3 = new Button("3");
		b4 = new Button("4");
		b5 = new Button("5");
		b6 = new Button("6");
		b7 = new Button("7");
		b8 = new Button("8");
		b9 = new Button("9");
	   
		bpm = new Button("+/-");
		bdot = new Button(".");
		bp = new Button("+");
		bm=new Button("-");
		bmulti = new Button("*");
		bd = new Button("/");
		bpercent = new Button("%");
		bbr = new Button("()");
	   
	   
		bx = new Button("1/x");
		bce = new Button("CE");
		bdel = new Button("DEL");
		bc = new Button("C");
	   
		bequal = new Button("=");
	   // 모든 버튼 객체 생성
   
  
	   board = new Panel();
	   board.setLayout(gridbag);
   
	   layout(b0,0,5,1,1);
	   layout(bdot,1,5,1,1);
	   layout(bequal,2,5,2,1);	// "=" 부분
   
	   layout(b1,0,4,1,1);
	   layout(b2,1,4,1,1);
	   layout(b3,2,4,1,1);
	   layout(bpm,3,4,1,1);
   
	   layout(b4,0,3,1,1);
	   layout(b5,1,3,1,1);
	   layout(b6,2,3,1,1);
	   layout(bbr,3,3,1,1);
   
	   layout(b7,0,2,1,1);
	   layout(b8,1,2,1,1);
	   layout(b9,2,2,1,1);
	   layout(bp,3,2,1,1);
   
	   layout(bpercent,0,1,1,1);
	   layout(bd,1,1,1,1);
	   layout(bmulti,2,1,1,1);
	   layout(bm,3,1,1,1);
   
	   layout(bc,0,0,1,1);
	   layout(bce,1,0,1,1);
	   layout(bx,2,0,1,1);
	   layout(bdel,3,0,1,1);
   

  
	   Panel display = new Panel();
	   display.setLayout(new GridLayout(0,6,5,5));
	   tf = new TextField(80);
	   tf.setSize(20,100);
	   // 텍스트필드 객체 생성
   
	   
	   add(tf, BorderLayout.NORTH);
	   add(board, BorderLayout.SOUTH);
   
	   setSize(300,250);
	   setVisible(true);
  }
  
	

public void layout(Component obj, int x, int y,int width, int height)
  {
	cc.gridx=x; // 시작위치 x
	cc.gridy=y; // 시작위치 y
	cc.gridwidth=width; // 컨테이너 너비
	cc.gridheight=height;  // 컨테이너 높이
   	board.add(obj,cc);
  }
}