import java.awt.*;

public class HWGridBagLayout extends Frame{
	private Button b0, b1, b2, b3, b4, b5, b6, b7, b8, b9, bpm,bm, bdot, bp, bmulti, bd, bc, bce, bdel, bbr, bpercent, bx, bequal;
	private Panel display, board;
	private TextField tf;
	
	GridBagConstraints cc;
	Container ct;
	
	public HWGridBagLayout() {
		super("HWGridBagLayout: KJS");
		GridBagLayout gridbag = new GridBagLayout();
		GridBagConstraints constraint = new GridBagConstraints();
		

		   
		   
		   constraint = new GridBagConstraints();
		   constraint.weightx = 1.0;
		   constraint.weighty = 1.0;
		   constraint.fill = GridBagConstraints.BOTH;
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
		   bm = new Button("-");
		   bmulti = new Button("*");
		   bd = new Button("/");
		   bsqrt = new Button("sqrt");
		   bpercent = new Button("%");
		   bequal = new Button("=");
		   // 모든 버튼 객체 생성
		   
		   
		   board = new Panel();
		   board.setLayout((LayoutManager) gridbag);
		   // 판넬 객체를 생성하고 레이아웃을 4행5열로 설정
		
		display= new Panel();
		board= new Panel();
		
		tf= new TextField(80);
		display.add(tf);
		
		// 화면 구성
		board.setLayout(new GridLayout(6,4));
		board.add(new Button("C"));
		board.add(new Button("CE"));
		board.add(new Button("1/x"));
		board.add(new Button("DEL"));
		board.add(new Button("%"));
		board.add(new Button("/"));
		board.add(new Button("X"));
		board.add(new Button("-"));
		board.add(new Button("7"));
		board.add(new Button("8"));
		board.add(new Button("9"));
		board.add(new Button("+"));
		board.add(new Button("4"));
		board.add(new Button("5"));
		board.add(new Button("6"));
		board.add(new Button("()"));
		board.add(new Button("1"));
		board.add(new Button("2"));
		board.add(new Button("3"));
		board.add(new Button("+/-"));
		board.add(new Button("0"));
		board.add(new Button("."));
		board.add(new Button("="));
		board.add(new Button("="));
		
		
		add(display,"North");
		add(board);
		
		setSize(600,500);
		setVisible(true);
	}
}
